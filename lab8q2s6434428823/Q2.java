/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Random;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        // Matrix A
        int[][] a = new int[10][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ran.nextInt(-100, 101);
            }
        }
        Mtx mA = new Mtx(a);
        // Matrix B
        int[][] b = new int[10][5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = ran.nextInt(-100, 101);
            }
        }
        Mtx mB = new Mtx(b);
        // Matrix C
        int[][] c = new int[5][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = ran.nextInt(-100, 101);
            }
        }
        Mtx mC = new Mtx(c);
        
        // print Matrix A, B, C
        System.out.println("A =");
        System.out.println(mA.toString());    
        System.out.println("B =");
        System.out.println(mB.toString());
        System.out.println("C =");
        System.out.println(mC.toString());
        
        // A+B
        if (mA.equalSize(mB)){
            int[][] ab = mA.add(mB);
            Mtx mAB = new Mtx(ab);
            System.out.println("A+B =");
            System.out.println(mAB.toString());
        } else{
            System.out.println("A and B are not equal size"+"\n");
        }
        
        // 2*B
        int[][] b2 = mB.mul(2);
        Mtx mB2 = new Mtx(b2);
        System.out.println("2*b =");
        System.out.println(mB2.toString());
        
        // A*B
        if (mA.compatible(mB)){
            int[][] AxB = mA.mul(mB);
            Mtx mAxB = new Mtx(AxB);
            System.out.println("A*B =");
            System.out.println(mAxB.toString());
        } else{
            System.out.println("A and B are not compatible"+"\n");
        }
        
        // A*C
        if (mA.compatible(mC)){
            int[][] AxC = mA.mul(mC);
            Mtx mAxC = new Mtx(AxC);
            System.out.println("A*C =");
            System.out.println(mAxC.toString());
        } else{
            System.out.println("A and C are not compatible"+"\n");
        }
    }
}
