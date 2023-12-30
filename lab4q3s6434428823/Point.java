/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Point {
    
    private double x, y;
    /**
     * 
     * @param x
     * @param y 
     */
    public Point(double x,double y){
        this.x=x; this.y=y;
    }
    /**
     * 
     * @param x
     * @param y
     * @return Distance of this point to (x,y).
     */
    public double distance(double x,double y){
        return Math.hypot(Math.abs(this.x-x), Math.abs(this.y-y));
    }
    /**
     * 
     * @param p
     * @return Distance of this point to point p.
     */
    public double distance(Point p){
        return Math.hypot(Math.abs(x-p.x), Math.abs(y-p.y));
    }
    /**
     * 
     * @param x
     * @param y
     * Translate this point from (x,y).
     */
    public void translate(double x, double y){
        this.x+=x; this.y+=y;
    }
    /**
     * 
     * @param p
     * @return If this point equals with point p will return true 
     * ,but if not equals will return false.
     */
    public boolean equals(Point p){
        return x==p.x && y==p.y;
    }
    /**
     * 
     * @return (x,y).
     */
    public String toString(){
        return "("+x+","+y+")";
    }
        
}
