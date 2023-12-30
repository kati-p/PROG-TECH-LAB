/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Square extends Quadrilateral {
    
    public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    @Override
    public double area() {
        double[] dis = getSortedDist();
        return dis[0] * dis[0];
    }
}
