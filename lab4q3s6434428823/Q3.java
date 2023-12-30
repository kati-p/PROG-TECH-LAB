/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Point A: ");
        Point a = new Point(ip.nextDouble(),ip.nextDouble());
        System.out.print("Point B: ");
        Point b = new Point(ip.nextDouble(),ip.nextDouble());
        System.out.println("A = "+a+" B = "+b+" Distance = "+a.distance(b));
        System.out.print("Move the points: ");
        double mx = ip.nextDouble();
        double my = ip.nextDouble();
        a.translate(mx, my); b.translate(mx, my);
        System.out.println("A = "+a+" B = "+b+" Distance = "+a.distance(b));
        if (a.equals(b)){
            System.out.println("A and B are at the same position.");
        } else{
            System.out.println("A and B are not at the same position.");
        }
    }
    
}
