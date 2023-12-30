/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan && notMe
 */
import java.util.ArrayList;

public class IconCineconic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cinema c1 = new Cinema("Cinema", 250);
        Cinema c2 = new Cinema("IMAX", 350);
        Cinema c3 = new Cinema("4DX", 450);

        ArrayList<MGenCard> cardAL = new ArrayList<>();

        cardAL.add(new MGenCard("Sasipa"));
        cardAL.add(new MGenFirstClass("Monnat"));
        cardAL.add(new MGenStudent("Mike"));

        System.out.println(MGenStudent.memberFee);

        System.out.println("Test run : Sasipa buys ticket(s) at cinema");
        cardAL.get(0).buyTicket(c1, 2);

        System.out.println("Test run : Sasipa buys ticket(s) at 4DX");
        cardAL.get(0).buyTicket(c3, 2);

        System.out.println("Test run : Monnat buys ticket(s) at IMAX");
        cardAL.get(1).buyTicket(c2, 2);

        System.out.println("Test run : Monnat buys ticket(s) at 4DX");
        cardAL.get(1).buyTicket(c3, 4);

        System.out.println("Test run : Mike buys ticket(s) at cinema");
        cardAL.get(2).buyTicket(c1, 2);

        System.out.println("Test run : Monnat gets 2 free tickets");
        MGenFirstClass m = (MGenFirstClass) cardAL.get(1);
        m.getFreeTicket();
        
        System.out.println("Test run : Call usePoint() of every object in the array list");
        for (MGenCard mgc : cardAL){
            mgc.usePoint();
        }
    }

}
