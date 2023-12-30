/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Sine extends Taylor {

    public Sine(int k, double x) {
        super(k, x);
    }

    @Override
    public double getApprox() {
        double result = getValue();
        double value = getValue();
        for (int n = 1; n <= getIteration(); n++) {
            value = value * -1 * getValue() * getValue();
            result = result + (value / factorial(2 * n + 1));
        }
        return result;
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.sine() is "
                + Math.sin(getValue()) + ".");
        System.out.println("Approximated value is "
                + getApprox() + ".");
    }
}
