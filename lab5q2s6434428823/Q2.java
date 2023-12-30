/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5q2s6434428823;

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
        Scanner inp = new Scanner(System.in);
        String name, id;
        int credit;
        System.out.print("Enter course ID, course name, credit: ");
        id = inp.next();
        name = inp.next();
        while (!inp.hasNextInt()) {name = name+" "+inp.next();}
        credit = inp.nextInt();
        Course c1 = new Course(name,id,credit);
        System.out.print("Enter course ID, course name: ");
        id = inp.next();
        name = inp.nextLine().trim();
        Course c2 = new Course(name,id);
        if (c1.equals(c2)){
            System.out.println("Same course");
            System.out.print("Enter course ID, course name, credit: ");
            id = inp.next();
            name = inp.next();
            while (!inp.hasNextInt()) {name = name+" "+inp.next();}
            credit = inp.nextInt();
            c2.setCid(id);
            c2.setCname(name);
            c2.setCredit(credit);
        } else {
            System.out.println("Different course name and course ID");
        }
        System.out.println(c1.getCid()+" "+c1.getCname()+" "+c1.getCredit());
        System.out.println(c2.getCid()+" "+c2.getCname()+" "+c2.getCredit());
        System.out.println("Total credit: "+c1.sumCredit(c2));  
    }
}
