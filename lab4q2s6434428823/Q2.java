/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q2s6434428823;

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
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter firstname lastname age: ");
        String phrase = ip.nextLine();
        int b1 = phrase.indexOf(" ");
        int b2 = phrase.indexOf(" ",b1+1);
        String fn = phrase.substring(0, b1);
        String ln = phrase.substring(b1, b2);
        String age = phrase.substring(b2);
        fn = fn.trim();
        ln = ln.trim();
        age = age.trim();
        System.out.println(ln+", "+fn+" is "+age+" years old.");
    }
    
}
