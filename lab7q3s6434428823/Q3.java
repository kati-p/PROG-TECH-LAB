/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;

public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, id, grade;
        int credit;
        Scanner ip = new Scanner(System.in);

        // get 3 students Array
        Student[] students = new Student[3];
        System.out.println("Enter 3 student ID and name: ");
        // student1
        String input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" ")).trim();
        Student s1 = new Student(name, id);
        students[0] = s1;
        // student2
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" ")).trim();
        Student s2 = new Student(name, id);
        students[1] = s2;
        // student3
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" ")).trim();
        Student s3 = new Student(name, id);
        students[2] = s3;

        // get 5 courses array
        Course[] courses = new Course[5];
        System.out.println("Enter 5 course ID, name and credit: ");
        // course1
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim();
        credit = Integer.parseInt(input.substring(input.lastIndexOf(" ")).trim());
        Course c1 = new Course(name, id, credit);
        courses[0] = c1;
        // course2
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim();
        credit = Integer.parseInt(input.substring(input.lastIndexOf(" ")).trim());
        Course c2 = new Course(name, id, credit);
        courses[1] = c2;
        // course3
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim();
        credit = Integer.parseInt(input.substring(input.lastIndexOf(" ")).trim());
        Course c3 = new Course(name, id, credit);
        courses[2] = c3;
        // course4
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim();
        credit = Integer.parseInt(input.substring(input.lastIndexOf(" ")).trim());
        Course c4 = new Course(name, id, credit);
        courses[3] = c4;
        //course5
        input = ip.nextLine().trim();
        id = input.substring(0, input.indexOf(" ")).trim();
        name = input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim();
        credit = Integer.parseInt(input.substring(input.lastIndexOf(" ")).trim());
        Course c5 = new Course(name, id, credit);
        courses[4] = c5;

        // get 3 students' grade
        // student1's grade
        System.out.println(s1.getName() + " grade report:");
        input = ip.nextLine().trim();
        while (!input.equals("X")) {
            id = input.substring(0, input.indexOf(" ")).trim();
            grade = input.substring(input.indexOf(" ")).trim();
            for (int i = 0; i < courses.length; i++) {
                if (id.equals(courses[i].getCid())) {
                    s1.addGradeReport(courses[i], grade);
                }
            }
            input = ip.nextLine().trim();
        }
        // student2's grade
        System.out.println(s2.getName() + " grade report:");
        input = ip.nextLine().trim();
        while (!input.equals("X")) {
            id = input.substring(0, input.indexOf(" ")).trim();
            grade = input.substring(input.indexOf(" ")).trim();
            for (int i = 0; i < courses.length; i++) {
                if (id.equals(courses[i].getCid())) {
                    s2.addGradeReport(courses[i], grade);
                }
            }
            input = ip.nextLine().trim();
        }
        // student3's grade
        System.out.println(s3.getName() + " grade report:");
        input = ip.nextLine().trim();
        while (!input.equals("X")) {
            id = input.substring(0, input.indexOf(" ")).trim();
            grade = input.substring(input.indexOf(" ")).trim();
            for (int i = 0; i < courses.length; i++) {
                if (id.equals(courses[i].getCid())) {
                    s3.addGradeReport(courses[i], grade);
                }
            }
            input = ip.nextLine().trim();
        }

        // print s1's transcript
        System.out.println("------Transcript ------");
        System.out.println(" " + s1.getID() + " " + s1.getName());
        System.out.println(s1.getAllTranscript());
        System.out.println(" GPA: " + s1.calGPA());
        // print s2's transcript
        System.out.println("------Transcript ------");
        System.out.println(" " + s2.getID() + " " + s2.getName());
        System.out.println(s2.getAllTranscript());
        System.out.println(" GPA: " + s2.calGPA());
        // print s3's transcript
        System.out.println("------Transcript ------");
        System.out.println(" " + s3.getID() + " " + s3.getName());
        System.out.println(s3.getAllTranscript());
        System.out.println(" GPA: " + s3.calGPA());
    }

}
