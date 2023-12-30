/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab14q3s6434428823;

import java.util.Scanner;

/**
 *
 * @author notMe && Tirawich Kasemchaiyanan
 */
public class Hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int n = inp.nextInt();

        moveDisks(n, 'A', 'B', 'C');
    }

    public static void moveDisks(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move " + n + " from " + a + " to " + c);
            return;
        }
        moveDisks(n - 1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        moveDisks(n - 1, b, a, c);
    }

}
