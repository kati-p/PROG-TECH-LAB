/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Truck extends Car {

    private double M_weight, weight;

    /**
     *
     * @param gas
     * @param efficiency
     * @param M_weight
     * @param weight
     */
    public Truck(double gas, double efficiency, double M_weight, double weight) {
        super(gas, efficiency);
        if (weight > M_weight) {
            this.M_weight = M_weight;
            this.weight = M_weight;
        } else {
            this.M_weight = M_weight;
            this.weight = weight;
        }
    }

    /**
     *
     * @param distance
     */
    @Override
    public void drive(double distance) {
        if (weight < 1) {
            super.drive(distance);
        } else if (weight >= 1 && weight <= 10) {
            distance = distance * 1.1;
            super.drive(distance);
        } else if (weight > 10 && weight <= 20) {
            distance = distance * 1.2;
            super.drive(distance);
        } else {
            distance = distance * 1.3;
            super.drive(distance);
        }
    }
}
