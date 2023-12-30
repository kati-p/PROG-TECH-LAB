/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q1s6434428823;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int lineNumber = 0;
        int wordCount = 0;
        int CharCount = 0;
        
        File fileW = new File("src\\lab13q1s6434428823\\text.txt");
        PrintWriter out = new PrintWriter(fileW);
                
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        while (!line.equals("quit")){
            out.println(line);
            line = reader.nextLine();            
        }
        out.close();
        
        File fileR = new File("src\\lab13q1s6434428823\\text.txt");
        Scanner in = new Scanner(fileR);
        while (in.hasNextLine()){
            line = in.nextLine();
            CharCount += line.length();
            String[] wordList = line.split(" ");
            wordCount += wordList.length;
            lineNumber++;
        }
        
        in.close();
        
        System.out.println("Total characters : " + CharCount);
        System.out.println("Total words : " + wordCount);
        System.out.println("Total lines : " + lineNumber);
    }
    
}
