/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q1s6434428823;

/**
 *
 * @author not me
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar = new Car(50, 20); // 20miles per gallon
        myCar.addGas(20); // add into tank 20gallons
        myCar.drive(100); // drive 100miles (use 5gallons)
        System.out.println("Gas left = " + myCar.getGas() + " gallons"); 
        Truck t = new Truck(50, 20, 15, 20);
        t.drive(100);
        System.out.println("Gas left = " + t.getGas() + " gallons");
        Truck t2 = new Truck(0, 20, 20, 15);
        t2.addGas(5);
        t2.drive(100);
        System.out.println("Gas left = " + t2.getGas() + " gallons");
    }
    
}
