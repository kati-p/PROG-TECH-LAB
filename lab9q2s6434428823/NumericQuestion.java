/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class NumericQuestion extends Question {

    /**
     *
     * @param q
     */
    public NumericQuestion(String q) {
        super(q);
    }

    /**
     *
     * @param response
     * @return true if response no more than +/- of answer
     */
    @Override
    public boolean checkAnswer(String response) {
        Double answer = Double.parseDouble(super.getAnswer());
        Double res = Double.parseDouble(response);
        return res <= answer + 0.01 && res >= answer - 0.01;
    }
}
