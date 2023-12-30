/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Subject implements Evaluation {

    private String subjName;
    private int[] score;

    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }

    @Override
    public double evaluate() {
        double sum = 0;
        int cnt = 0;
        for (int s : score) {
            sum += s;
            cnt++;
        }
        return sum / cnt;
    }

    @Override
    public char grade(double s) {
        if (s >= 70) {
            return 'P';
        }
        return 'F';
    }

    @Override
    public String toString() {
        return subjName;
    }
}
