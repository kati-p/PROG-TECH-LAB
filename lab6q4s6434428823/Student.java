/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q4s6434428823;

/**
 *
 * @author Tirawich Kasemchiyanan
 */
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Student {

    private String name, id;
    private int year, month, day;
    /**
     * 
     * @param name
     * @param id 
     */
    public Student(String name,String id){
        this.name = name; this.id = id;
        GregorianCalendar bd = new GregorianCalendar();
        year = bd.get(GregorianCalendar.YEAR);
        month = bd.get(GregorianCalendar.MONTH)+1;
        day = bd.get(GregorianCalendar.DATE);
    }
    /**
     * 
     * @param name
     * @param id
     * @param day
     * @param month
     * @param year 
     */
    public Student(String name, String id, int day, int month, int year){
        this.name = name; this.id = id; 
        this.year = year; this.month = month;
        this.day = day;
    }
    /**
     * 
     * @param day
     * @param month
     * @param year
     * set day/month/year
     */
    public void setBD(int day, int month, int year){
        this.year = year; this.month = month;
        this.day = day;
    }
    /**
     * 
     * @param name 
     * set name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * 
     * @return (String) day month year
     */
    public String getBD(){
        return day+" "+month+" "+year; 
    }
    /**
     * 
     * @return (String) name
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @return (String) id
     */
    public String getID(){
        return id;
    }
    /**
     * 
     * @return (int) age
     */
    public int getAge(){
        GregorianCalendar now = new GregorianCalendar();
        int age = now.get(GregorianCalendar.YEAR)-this.year;
        return age;
    }
    /**
     * 
     * @param day
     * @return (int) day/365.242199
     */
    public int daysToYears(int day){
        return (int)(day/365.242199);
    }
    /**
     * 
     * @param s
     * object class Student
     * @return true if both objects equal
     */
    public boolean equals(Student s){
        return name.equals(s.name) && id.equals(s.id) && day==s.day 
                && month==s.month && year==s.year;
    }
    /**
     * 
     * @return (String) name id day month year
     */
    public String toString(){
        return name+" "+id+" "+day+" "+month+" "+year;
    }
    /**
     * 
     * @param id
     * set id
     */
    public void setID(String id){
        this.id = id;
    }
    /**
     * 
     * @param beginIndex
     * @param endIndex
     * @return (int) that get digit
     */
    private int getDigit(int beginIndex, int endIndex){
        return Integer.parseInt(id.substring(beginIndex, endIndex+1));
    }
    /**
     * 
     * @return ID's facultyCode
     */
    public int getFacultyCode(){
        return this.getDigit(8, 9);
    }
    /**
     * 
     * @return ID's leavelCode
     */
    public int getLevelCode(){
        return this.getDigit(2, 2);
    }
    /**
     * 
     * @return ID's year
     */
    public int getYear(){
        return this.getDigit(0, 1);
    }
    /**
     * 
     * @param s
     * @return true if both objects are the same year
     */
    public boolean sameYear(Student s){
        return this.getYear()==s.getYear();
    }
    /**
     * 
     * @param s
     * @return true if both objects are the same level
     */
    public boolean sameLevel(Student s){
        return this.getLevelCode()==s.getLevelCode();
    }
    /**
     * 
     * @param s
     * @return true if both objects are the same faculty
     */
    public boolean sameFaculty(Student s){
        return this.getFacultyCode()==s.getFacultyCode();
    }
    /**
     * 
     * @return true if id is BigInteger and id's length = 10
     */
    public boolean checkID(){
        Scanner reader = new Scanner(id);
        return reader.hasNextBigInteger() && id.length()==10;
    }
}
