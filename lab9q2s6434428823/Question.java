/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Question {

    private String text, answer;

    /**
     *
     */
    public Question() {

    }

    /**
     *
     * @param q
     */
    public Question(String q) {
        text = q;
    }

    /**
     *
     * @param q
     */
    public void setText(String q) {
        text = q;
    }

    /**
     *
     * @param a
     */
    public void setAnswer(String a) {
        answer = a;
    }

    /**
     *
     * @return question
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     *
     * @param response
     * @return true if response is the answer
     */
    public boolean checkAnswer(String response) {
        return answer.equals(response);
    }

    /**
     *
     * - print question
     */
    public void display() {
        System.out.println(text);
    }
}
