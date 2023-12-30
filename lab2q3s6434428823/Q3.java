/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;    
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random num = new Random();
        GregorianCalendar today = new GregorianCalendar();
        System.out.println("Current date: "
                +today.get(Calendar.DATE)+"-"
                +today.get(Calendar.MONTH)+"-"
                +today.get(Calendar.YEAR));
        System.out.print("Enter your name: "); 
        input.nextLine();
        GregorianCalendar birth = new GregorianCalendar(
                num.nextInt(2022-2000)+2000,
                num.nextInt(12),
                num.nextInt(29-1)+1);
        System.out.println("Birth date: "
                +birth.get(Calendar.DATE)+"-"
                +birth.get(Calendar.MONTH)+"-"
                +birth.get(Calendar.YEAR));
        long age = today.getTime().getTime()-birth.getTime().getTime();
        age/=1000*60*60*24;
        System.out.println("Age in days: "+age);
    }
    
}
