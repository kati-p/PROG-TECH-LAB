/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Mtx {

    private int[][] number;

    /**
     *
     * @param m - array 2D (Matrix)
     */
    public Mtx(int[][] m) {
        number = m;
    }

    /**
     *
     * @param m - Object Matrix
     * @return true if both Matrix size equal
     */
    public boolean equalSize(Mtx m) {
        if (number.length == m.number.length) {
            for (int i = 0; i < number.length && number[i].length == m.number[i].length; i++) {
                if (i == number.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param m - Object Matrix
     * @return true if both objects can compatible
     */
    public boolean compatible(Mtx m) {
        for (int i = 0; i < number.length && number[i].length == m.number.length; i++) {
            if (i == number.length - 1) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param m - Object Matrix
     * @return array 2D that is sum of both Matrix
     */
    public int[][] add(Mtx m) {
        int[][] sum = number.clone();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                sum[i][j] += m.number[i][j];
            }
        }
        return sum;
    }

    /**
     *
     * @param m - Object Matrix
     * @return array 2D that is multiply of both Matrix
     */
    public int[][] mul(Mtx m) {
        int sum=0;
        int[][] mul = new int[number.length][m.number[0].length];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < m.number[0].length; j++) {
                for (int k = 0; k < m.number.length; k++) {
                    sum += number[i][k] * m.number[k][j];
                }
                mul[i][j] = sum;
                sum = 0;
            }
        }
        return mul;
    }

    /**
     *
     * @param n - integer
     * @return array 2D that is multiply of integer and Matrix
     */
    public int[][] mul(int n) {
        int[][] mul = number.clone();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                mul[i][j] = number[i][j] * n;
            }
        }
        return mul;
    }

    /**
     *
     * @return String of Matrix
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                str += number[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}
