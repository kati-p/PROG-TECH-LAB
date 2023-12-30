/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q1s6434428823;

/**
 *
 * @author Tirawich Kasemchiyanan
 */
import java.util.GregorianCalendar;
public class Student {

    private String name, id;
    private int year, month, day;
    public Student(String name,String id){
        this.name = name; this.id = id;
        GregorianCalendar bd = new GregorianCalendar();
        year = bd.get(GregorianCalendar.YEAR);
        month = bd.get(GregorianCalendar.MONTH)+1;
        day = bd.get(GregorianCalendar.DATE);
    }
    public Student(String name, String id, int day, int month, int year){
        this.name = name; this.id = id; 
        this.year = year; this.month = month;
        this.day = day;
    }
    public void setBD(int day, int month, int year){
        this.year = year; this.month = month;
        this.day = day;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBD(){
        return day+" "+month+" "+year; 
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public int getAge(){
        GregorianCalendar now = new GregorianCalendar();
        int age = now.get(GregorianCalendar.YEAR)-this.year;
        return age;
    }
    public int daysToYears(int day){
        return (int)(day/365.242199);
    }
    public boolean equals(Student stu2){
        return this.toString().equals(stu2.toString());
    }
    public String toString(){
        return name+" "+id+" "+day+" "+month+" "+year;
    }
    public void setID(String id){
        this.id = id;
    }
}
