/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Secretary extends Employee implements Evaluation {

    private int typingSpeed;
    private int[] score = new int[2];

    public Secretary(String name, int salary, int[] score, int typingSpeed) {
        super(name, salary);
        this.score = score;
        this.typingSpeed = typingSpeed;
    }

    @Override
    public double evaluate() {
        double sum = 0;
        for (int s : score) {
            sum += s;
        }
        return sum;
    }

    @Override
    public char grade(double s) {
        if (s >= 90) {
            setSalary(18000);
            return 'P';
        }
        return 'F';
    }
}
