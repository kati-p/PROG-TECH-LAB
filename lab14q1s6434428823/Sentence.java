/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab14q1s6434428823;

/**
 *
 * @author notMe && Tirawich Kasemchaiyanan
 */
public class Sentence {

    private String s;

    public Sentence(String s) {
        this.s = s;
    }

    public boolean find(String sf) {
        return find(sf, sf.length() - 1, s.length() - 1);
    }

    private boolean find(String sf, int len, int ind) {
        if (sf.charAt(len) == s.charAt(ind) && len == 0) {
            return true;
        } else if (sf.charAt(len) == s.charAt(ind)) {
            return find(sf, len - 1, ind - 1);
        } else if (sf.charAt(len) != s.charAt(ind) && ind == 0) {
            return false;
        } else {
            return find(sf, len, ind - 1);
        }
    }
}
