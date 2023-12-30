/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.ArrayList;

public class Order {

    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p = new ArrayList<>();

    public Order(Customer c) {
        this.c = c;
        cntOrder++;
        id = cntOrder;
    }

    public void addPizza(Pizza p) {
        this.p.add(p);
    }

    public String getOrderDetail() {
        String pizza = "";
        for (Pizza p : p) {
            pizza += p.toString() + "\n";
        }
        return "Order id : " + id + "\n"
                + c.toString() + "\n"
                + pizza + "Total pieces : " + p.size() + "\n"
                + "Total cost : " + calculatePayment();
    }

    public double calculatePayment() {
        double cost = 0;
        for (Pizza p : p) {
            if (c instanceof GoldCustomer) {
                GoldCustomer gc = (GoldCustomer) c;
                double discount = p.getPrice() * gc.getDiscount() / 100;
                cost += p.getPrice() - discount;
            } else {
                cost += p.getPrice();
            }
        }
        return cost;
    }
}
