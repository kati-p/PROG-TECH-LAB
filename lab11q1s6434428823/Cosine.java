/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Cosine extends Taylor {

    public Cosine(int k, double x) {
        super(k, x);
    }
    
    @Override
    public double getApprox() {
        double result = 1;
        double value = 1;
        for (int n = 1; n <= getIteration(); n++) {
            value = value * -1 * getValue() * getValue();
            result = result + (value / factorial(2 * n));
        }
        return result;
    }
    
    @Override
    public void printValue() {
        System.out.println("Value from Math.cos() is "
                + Math.cos(getValue()) + ".");
        System.out.println("Approximated value is "
                + getApprox() + ".");
    }
}
