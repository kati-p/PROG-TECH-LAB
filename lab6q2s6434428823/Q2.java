/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum =0;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = ip.nextInt();
        int b = ip.nextInt();
        int c = ip.nextInt();
        for (int i=a; i<=b; i++){
            for (int j=i; j<=(c*i); j++){
                sum+=i*i+j;
            }
        }
        System.out.println("Answer = "+sum);
    }
    
}
