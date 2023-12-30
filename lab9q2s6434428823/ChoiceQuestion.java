/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.ArrayList;

public class ChoiceQuestion extends Question {

    ArrayList<String> choices = new ArrayList<>();

    public ChoiceQuestion(String q) {
        super(q);
    }
    
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if (correct){
            setAnswer(choice);
        }
    }
    @Override
    public void display(){
        super.display();
        for (int i=0; i<choices.size(); i++){
            System.out.println((i+1)+": "+choices.get(i));
        }
    }
    @Override
    public boolean checkAnswer(String response){
        return super.checkAnswer(choices.get(Integer.parseInt(response)-1));
    }
}
