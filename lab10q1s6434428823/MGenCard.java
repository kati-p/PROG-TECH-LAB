/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q1s6434428823;

/**
 *
 * @author notMe && Tirawich Kasemchaiyanan
 */
public class MGenCard {

    public static int memberFee = 150;
    public static int cnt = 0;
    private int number;
    private String name;
    private int point;

    public MGenCard(String name) {
        cnt++;
        this.number = cnt;
        this.name = name;
    }

    public void usePoint() {
        if (point >= 20) {
            System.out.println("You got a free Cinema ticket");
            point -= 20;
        } else {
            System.out.println("You don't have enough points");
        }
        System.out.println(toString());
    }

    public void buyTicket(Cinema c, int number) {
        int cost = c.getTicketPrice() * number;
        point += cost / 50;
        System.out.println(c.getName() + " Total amount : " + cost);
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "iconcineconic." + getClass().getSimpleName() + "[number : " +
                number + ", name : " + name + ", point : " + point + "]";
    }

}
