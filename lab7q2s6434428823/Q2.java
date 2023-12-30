/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        for (int p=3; p<n; p++){
            for (int i=0; i<primeList.size() && p%primeList.get(i)!=0; i++){
                if (i==primeList.size()-1){
                    primeList.add(p);
                }
            }
        }
        System.out.println();
        for (int i=0; i<primeList.size(); i++){
            System.out.println(primeList.get(i));
        }
    }    
}
