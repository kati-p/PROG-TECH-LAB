/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q4s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;

public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, id;
        Scanner ip = new Scanner(System.in);
        System.out.println("Student 1: Enter ID, name ");
        id = ip.next();
        name = ip.nextLine().trim();
        Student s1 = new Student(name, id);
        System.out.println("Student 2: Enter ID, name ");
        id = ip.next();
        name = ip.nextLine().trim();
        Student s2 = new Student(name, id);
        if (s1.checkID() && s2.checkID()) {
            if (s1.sameYear(s2)) {
                System.out.print("same year, ");
            } else {
                System.out.print("different year, ");
            }
            if (s1.sameLevel(s2)) {
                System.out.print("same level, ");
            } else {
                System.out.print("different level, ");
            }
            if (s1.sameFaculty(s2)) {
                System.out.print("same faculty\n");
            } else {
                System.out.print("different faculty\n");
            }
        } else {
            System.out.println("Invalid value");
        }

    }
}
