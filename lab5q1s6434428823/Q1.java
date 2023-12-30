/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Press 1 to sum three integers.");
        System.out.println("Press 2 to find roots of a quadratic equation.");
        System.out.println("Press 3 to find the area of a rectangle.");
        System.out.println("Press 4 to print A's.");
        String cond = inp.nextLine();
        switch (cond){
            case "1":
                System.out.println("Enter 3 integers:");
                int x = inp.nextInt();
                int y = inp.nextInt();
                int z = inp.nextInt();
                int sum = x+y+z;
                System.out.println("Sum: "+sum);
                break;
            case "2":
                System.out.println("Enter a, b,cfor ax^2+bx+c=0 :");
                double a = inp.nextDouble();
                double b = inp.nextDouble();
                double c = inp.nextDouble();
                if (b*b-4*a*c >= 0) {
                    double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
                    double x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
                    System.out.println("Two roots: "+x1+", "+x2);
                } else{
                    System.out.println("invalid value");
                }
                break;
            case "3":
                System.out.println("Enter the length of 2 sides of the rectangle:");
                double l1 = inp.nextDouble();
                double l2 = inp.nextDouble();
                double area = l1*l2;
                System.out.println("Area: "+area);
                break;
            case "4":
                System.out.println("How many A’s?");
                int n = inp.nextInt();
                for (int i=0; i<=n-1; i++){
                    System.out.print("A");
                }
                System.out.println("");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        
    }
    
}
