package lab1q2s6434428823;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter birth year: ");
        int year = input.nextInt();
        int age = 2565 - year;
        System.out.println(name+" is "+age+" years old.");
    }   
}
