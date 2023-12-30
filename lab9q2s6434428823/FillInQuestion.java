/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434428823;

/**
 *
 * @author not me
 */
import java.util.Scanner;

public class FillInQuestion extends Question {

    public FillInQuestion() {
        super();
    }

    public void constructQuestionAndAnswer(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        parser.close();

        question += " ";
        for (int i = 0; i < answer.length(); i++) {
            question += "_ ";
        }

        this.setText(question);
        this.setAnswer(answer);
    }
}
