/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Expo extends Taylor {

    public Expo(int k, double x) {
        super(k, x);
    }

    @Override
    public double getApprox() {
        double result = 1;
        double value = 1;
        for (int n = 1; n <= getIteration(); n++) {
            value = value * getValue();
            result = result + (value / factorial(n));
        }
        return result;
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is "
                + Math.exp(getValue()) + ".");
        System.out.println("Approximated value is "
                + getApprox() + ".");
    }
}
