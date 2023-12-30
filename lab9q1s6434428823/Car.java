/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Car {

    private double gas, efficiency;

    /**
     *
     * @param gas
     * @param efficiency
     */
    public Car(double gas, double efficiency) {
        this.gas = gas;
        this.efficiency = efficiency;
    }

    /**
     *
     * @param distance
     */
    public void drive(double distance) {
        double gasLeft = gas - distance / efficiency;
        if (gasLeft < 0) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            gas = gasLeft;
        }
    }

    /**
     *
     * @param amount
     */
    public void setGas(double amount) {
        gas = amount;
    }

    /**
     *
     * @return amount of gas
     */
    public double getGas() {
        return gas;
    }

    /**
     *
     * @return efficiency
     */
    public double getEfficiency() {
        return efficiency;
    }

    /**
     *
     * @param amount
     */
    public void addGas(double amount) {
        gas = gas + amount;
    }
}
