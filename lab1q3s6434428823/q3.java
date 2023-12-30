package lab1q3s6434428823;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float x = input.nextFloat();
        System.out.print("Enter anoter number: ");
        float y = input.nextFloat();
        float xy = x * y;
        float z = x + y;
        float sum = xy/z;
        System.out.println("The ratio between their "
                + "product and their sum is " + sum);
    }    
}
