/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q2s6434428823;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File wordlist = new File("src\\lab13q2s6434428823\\wordlist.txt");
        ArrayList<String> words = new ArrayList<>();
        boolean allWords = true;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = reader.nextLine();
        String[] wordInSentence = sentence.split(" ");

        try ( Scanner in = new Scanner(wordlist)) {
            while (in.hasNext()) {
                words.add(in.nextLine());
            }

            System.out.println("Words not contained: ");
            for (int i = 0; i < wordInSentence.length; i++) {
                for (int j = 0; j < words.size() && !wordInSentence[i].equals(words.get(j)); j++) {
                    if (!wordInSentence[i].equals(words.get(j)) && j == words.size() - 1) {
                        System.out.println(wordInSentence[i]);
                        allWords = false;
                    }
                }
            }
            if (allWords) {
                System.out.println("N/A");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
