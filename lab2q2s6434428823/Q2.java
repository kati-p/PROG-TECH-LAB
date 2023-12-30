/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q2s6434428823;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GregorianCalendar today = new GregorianCalendar();
        System.out.println("Current Date: "
                +today.get(Calendar.DATE)+" "
                +today.get(Calendar.MONTH)+", "
                +today.get(Calendar.YEAR));
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt()-1;
        System.out.print("Enter year: ");
        int year = input.nextInt();
        GregorianCalendar nextDay = new GregorianCalendar(year,month,day);
        long diffDay = nextDay.getTime().getTime()-today.getTime().getTime();
        diffDay/=1000*60*60*24;
        System.out.println("Number of days: "+diffDay);
    }
    
}
