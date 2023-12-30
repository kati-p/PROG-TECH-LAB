/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File scoreFile = new File("C:\\Users\\DELUX\\Desktop\\เก็บงานมหาลัย\\ปี1 เทอม2\\PROG TECH\\Lab\\lab6q3s6434428823\\src\\lab6q3s6434428823\\score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            double max=0;
            double min=0;
            double sum=0;
            int cnt=0;
            while (scoreReader.hasNextLine()){
                double n = scoreReader.nextDouble();
                sum+=n;
                if (cnt==0){
                    max=n;
                    min=n;
                } else{
                    if (n>max) max=n;
                    if (n<min) min=n;
                }
                cnt++;               
            }
            System.out.println("Average score = "+(sum/cnt));
            System.out.println("Highest score = "+max);
            System.out.println("Lowest score = "+min);
            scoreReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
        }
    }
    
}
