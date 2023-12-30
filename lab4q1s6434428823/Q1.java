/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q1s6434428823;

/**
 *
 * @author Tirawich kasemchaiyanan
 */
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First point : ");
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        System.out.print("Second point: ");
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();
        System.out.print("Third point : ");
        double px3 = input.nextDouble();
        double py3 = input.nextDouble();
        System.out.print("Fourth point: ");
        double px4 = input.nextDouble();
        double py4 = input.nextDouble();
        double cx = (px1+px2+px3+px4)/4.0;
        double cy = (py1+py2+py3+py4)/4.0;
        double d1 = Math.hypot(Math.abs(cx-px1), Math.abs(cy-py1));
        double d2 = Math.hypot(Math.abs(cx-px2), Math.abs(cy-py2));
        double d3 = Math.hypot(Math.abs(cx-px3), Math.abs(cy-py3));
        double d4 = Math.hypot(Math.abs(cx-px4), Math.abs(cy-py4));
        double dmax = Math.max(Math.max(d1,d2), Math.max(d3, d4));
        double dmin = Math.min(Math.min(d1,d2), Math.min(d3, d4));
        System.out.println("The centroid is ( "+cx+", "+cy+" ).");
        System.out.println("Sum of distance is "+(d1+d2+d3+d4)+".");
        System.out.println("Shortest distance is "+dmin+".");
        System.out.println("Longest distance is "+dmax+".");
    }
    
}
