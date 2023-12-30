/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q1s6434428823;

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
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int[] primeArr = new int[n];
        int prime = 2;
        primeArr[0] = prime;
        for (int i=1; i<primeArr.length; i++){
            prime++;
            for (int j = i-1; prime%primeArr[j]==0 || j!=0; j--){
                if (prime%primeArr[j]==0){
                    prime++;
                    j = i-1;
                }
            }
            primeArr[i] = prime;
        }
        System.out.println();
        for (int p: primeArr){
            System.out.println(p);
        }
    }
}
