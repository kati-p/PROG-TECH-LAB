/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q1s6434428823;

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
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter course ID, name, credit: or X to stop");
        String input = ip.nextLine().trim();
        while (!input.equals("X")){
            String id = input.substring(0, input.indexOf(" ")).trim();
            String name = input.substring(input.indexOf(" ",input.lastIndexOf(" "))).trim();
            int credit = Integer.parseInt(input.substring(input.lastIndexOf(" ")).trim());
            Course c = new Course(name,id,credit);
            input = ip.nextLine().trim();
        }
        System.out.println(Course.numberOfCourses()+" courses");
        System.out.println(Course.numberOfFacCourses(23)+" courses for 23");
        System.out.println(Course.numberOfFacCourses(21)+" courses for 21");
    }
    
}
