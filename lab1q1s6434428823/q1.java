
package lab1q1s6434428823;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.println(name+" is "+age+" years old.");
    }    
}
