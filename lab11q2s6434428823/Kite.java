/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Kite extends Quadrilateral {
    
    public Kite(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    @Override
    public double area() {
        double diag = 1;
        double[] dis = getSortedDist();
        for (int i = 0; i < dis.length; i++){
            for (int j = i+1; j < dis.length && dis[i] != 0; j++){
                if (dis[i] == dis[j]) {
                    dis[i] = 0;
                    dis[j] = 0;
                }
            }
        }
        for (int i = 0; i < dis.length; i++){
            if (dis[i] != 0){
                diag *= dis[i];
            }
        }
        return diag/2;
    }
}
