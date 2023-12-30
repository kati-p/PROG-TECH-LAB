/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q1s6434428823;

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
        double grade;
        int credit;
        double sum=0;
        int cnt=0;
        System.out.println("Enter course ID, creditand grade; or X to terminate");
        String ip = inp.nextLine();
        while (!ip.equals("X")){
            String[] s = ip.split(" ", 3);
            String sg = s[2];
            if (sg.equals("A")){
                grade = 4;
            } else if (sg.equals("B+")){
                grade = 3.5;
            } else if (sg.equals("B")){
                grade = 3;
            } else if (sg.equals("C+")){
                grade = 2.5;
            } else if (sg.equals("C")){
                grade = 2;
            } else if (sg.equals("D+")){
                grade = 1.5;
            } else if (sg.equals("D")){
                grade = 1;
            } else if (sg.equals("F")){
                grade = 0;
            } else{
                System.out.println("Invalid value");
                ip = inp.nextLine();
                continue;
            }
            Scanner cInt = new Scanner(s[1]);
            if (cInt.hasNextInt()){
                credit = Integer.parseInt(s[1]);
            } else{
                System.out.println("Invalid value");
                ip = inp.nextLine();
                continue;
            }
            sum+=grade*credit;
            cnt+=credit;
            ip = inp.nextLine();
        }
        System.out.println("GPA = "+(sum/cnt));
    }
    
}
