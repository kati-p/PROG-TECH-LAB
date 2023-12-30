/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q2s6434428823;

/**
 *
 * @author notMe && Tirawich Kasemchaiyanan
 */
import java.awt.Point;

public abstract class Quadrilateral {

    private Point a, b, c, d;

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }

    public double[] getSortedDist() {
        double[] dis = {a.distance(b), a.distance(c), a.distance(d),
            b.distance(c), b.distance(d), c.distance(d)};
        for (int i = 0; i < dis.length; i++) {
            for (int j = i + 1; j < dis.length; j++) {
                if (dis[i] > dis[j]) {
                    double num = dis[i];
                    dis[i] = dis[j];
                    dis[j] = num;
                }
            }
        }
        return dis;
    }

    @Override
    public String toString() {
        Point[] p = {a, b, c, d};
        String s = "";
        for (int i = 0; i < p.length; i++) {
            s += p[i].getClass().getName() + "[x=" + (int) p[i].getX()
                    + ",y=" + (int) p[i].getY() + "]";
            if (i != p.length - 1) {
                s += "\n";
            }
        }
        return s;
    }

    public abstract double area();
}
