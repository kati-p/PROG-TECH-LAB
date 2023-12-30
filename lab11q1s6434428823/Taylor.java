/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public abstract class Taylor {

    private int k;
    private double x;

    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }

    public int factorial(int n) {
        int fac = 1;
        for (int i = n; i > 1; i--) {
            fac = fac * i;
        }
        return fac;
    }

    public int getIteration() {
        return k;
    }

    public double getValue() {
        return x;
    }

    public abstract void printValue();

    public abstract double getApprox();
}
