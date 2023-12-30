/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11q1s6434428823;

/**
 *
 * @author notMe && Tirawich Kasemchaiyanan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();
        
        //add to test polymorphism
        System.out.println("\n" + "\t" + "<<< Test polymorphism >>>");
        Taylor[] taylors = new Taylor[3];
        taylors[0] = new Expo(7, 1);
        taylors[1] = new Sine(7, Math.PI/4);
        taylors[2] = new Cosine(7, 1);
        for (Taylor t : taylors){
            t.printValue();
        }
    }
    
}
