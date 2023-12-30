/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab14q2s6434428823;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author notMe && TirawichKasemchaiyanan
 */
public class DirectorySize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    private static long getSize(File f) {
        if (f.isFile()) {
            return f.length();
        } else if (f.isDirectory() && f.listFiles().length != 0) {
            return getSize(f.listFiles(), f.listFiles().length - 1);
        } else {
            return 0;
        }
    }

    private static long getSize(File[] fs, int len) {
        if (len == 0) {
            return getSize(fs[0]);
        } else {
            return getSize(fs[len]) + getSize(fs, len - 1);
        }
    }
}
