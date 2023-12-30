/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class MGenStudent extends MGenCard {

    public final static int discount = 20;
    
    public MGenStudent(String name){
        super(name);
    }
    
    @Override
    public void buyTicket(Cinema c, int number){
        super.buyTicket(c, number);
        double cost = c.getTicketPrice() * number;
        System.out.println("You got " + cost * discount / 100 + " discount");
    }
}
