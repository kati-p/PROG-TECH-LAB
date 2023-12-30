/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;
public class Q1 {
    
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Student 1: Enter ID, birthday, name");
        String id = ip.next();
        int day = ip.nextInt();
        int month = ip.nextInt();
        int year = ip.nextInt();
        String name = ip.next();
        Student stu1 = new Student(name,id,day,month,year);
        System.out.println("Student 2: Enter ID, name");
        id = ip.next();
        name = ip.next();
        Student stu2 = new Student(name,id);
        System.out.println("Student 1: "+stu1.getName()+" "
                +stu1.getID()+" "+stu1.getAge());
        System.out.println("Student 2: "+stu2.getName()+" "
                +stu2.getID()+" "+stu2.getAge());
        if (stu1.equals(stu2))
            System.out.println("same");
        else
            System.out.println("not same");
        System.out.println("Enter name, birthday for Student 2");
        name = ip.next();
        day = ip.nextInt();
        month = ip.nextInt();
        year = ip.nextInt();
        stu2.setName(name);
        stu2.setBD(day, month, year);
        System.out.println("Student 1: "+stu1.getName()+" "
                +stu1.getID()+" "+stu1.getAge());
        System.out.println("Student 2: "+stu2.getName()+" "
                +stu2.getID()+" "+stu2.getAge());
        if (stu1.equals(stu2))
            System.out.println("same");
        else
            System.out.println("not same");
    }
    
}
