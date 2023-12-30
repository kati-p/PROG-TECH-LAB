/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class PizzaSpecial extends Pizza {

    private String special;

    public PizzaSpecial(String name, double price, String special) {
        super(name, price);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return super.toString() + " special : " + special;
    }
}
