/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab12q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.ArrayList;

public class BusTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<>();
        arr.add(new Hybrid(45, 1.2e6, 600, 150, 1));
        arr.add(new CNGBus(50, 1e6, 200, 2));
        for (Bus b : arr) {
            System.out.println("ID: " + b.getID());
            if (b instanceof CNGBus) {
                System.out.println("Emission Tier: " + ((CNGBus) b).getEmissionTier());
            }
            if (b instanceof Hybrid) {
                System.out.println("Emission Tier: " + ((Hybrid) b).getEmissionTier());
            }
            System.out.println("Accel: " + b.getAccel());
        }
    }

}
