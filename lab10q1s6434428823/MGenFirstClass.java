/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class MGenFirstClass extends MGenCard {

    private int freeTicket = 2;

    public MGenFirstClass(String name) {
        super(name);
    }

    public void getFreeTicket() {
        if (freeTicket == 2) {
            freeTicket = 0;
            System.out.println("You got 2 Cinema tickets");
        } else {
            System.out.println("You already got the free tickets");
        }
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        return super.toString() + "[free ticket : " + freeTicket + "]";
    }
}
