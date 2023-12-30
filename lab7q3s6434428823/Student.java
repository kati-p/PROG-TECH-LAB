/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {

    private String name, id;
    private int year, month, day;

    /**
     *
     * @param name
     * @param id
     */
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        GregorianCalendar bd = new GregorianCalendar();
        year = bd.get(GregorianCalendar.YEAR);
        month = bd.get(GregorianCalendar.MONTH) + 1;
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
    public Student(String name, String id, int day, int month, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     *
     * @param day
     * @param month
     * @param year set day/month/year
     */
    public void setBD(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     *
     * @param name set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return (String) day month year
     */
    public String getBD() {
        return day + " " + month + " " + year;
    }

    /**
     *
     * @return (String) name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return (String) id
     */
    public String getID() {
        return id;
    }

    /**
     *
     * @return (int) age
     */
    public int getAge() {
        GregorianCalendar now = new GregorianCalendar();
        int age = now.get(GregorianCalendar.YEAR) - this.year;
        return age;
    }

    /**
     *
     * @param day
     * @return (int) day/365.242199
     */
    public int daysToYears(int day) {
        return (int) (day / 365.242199);
    }

    /**
     *
     * @param s object class Student
     * @return true if both objects equal
     */
    public boolean equals(Student s) {
        return name.equals(s.name) && id.equals(s.id) && day == s.day
                && month == s.month && year == s.year;
    }

    /**
     *
     * @return (String) name id day month year
     */
    public String toString() {
        return name + " " + id + " " + day + " " + month + " " + year;
    }

    /**
     *
     * @param id set id
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     *
     * @param beginIndex
     * @param endIndex
     * @return (int) that get digit
     */
    private int getDigit(int beginIndex, int endIndex) {
        return Integer.parseInt(id.substring(beginIndex, endIndex + 1));
    }

    /**
     *
     * @return ID's facultyCode
     */
    public int getFacultyCode() {
        return this.getDigit(8, 9);
    }

    /**
     *
     * @return ID's leavelCode
     */
    public int getLevelCode() {
        return this.getDigit(2, 2);
    }

    /**
     *
     * @return ID's year
     */
    public int getYear() {
        return this.getDigit(0, 1);
    }

    /**
     *
     * @param s
     * @return true if both objects are the same year
     */
    public boolean sameYear(Student s) {
        return this.getYear() == s.getYear();
    }

    /**
     *
     * @param s
     * @return true if both objects are the same level
     */
    public boolean sameLevel(Student s) {
        return this.getLevelCode() == s.getLevelCode();
    }

    /**
     *
     * @param s
     * @return true if both objects are the same faculty
     */
    public boolean sameFaculty(Student s) {
        return this.getFacultyCode() == s.getFacultyCode();
    }

    /**
     *
     * @return true if id is BigInteger and id's length = 10
     */
    public boolean checkID() {
        Scanner reader = new Scanner(id);
        return reader.hasNextBigInteger() && id.length() == 10;
    }

    private ArrayList<CourseGrade> transcript = new ArrayList<>();

    /**
     *
     * @param c : course
     * @param g : grade - add course grade in class CourseGrade to transcript
     */
    public void addGradeReport(Course c, String g) {
        CourseGrade cg = new CourseGrade(c, g);
        transcript.add(cg);
    }

    /**
     *
     * @return GPA - sumGrade from transcript divided by sumCredit from
     * transcript
     */
    public double calGPA() {
        double sumGrade = 0;
        int sumCredit = 0;
        for (int i = 0; i < transcript.size(); i++) {
            Course c = transcript.get(i).getCourse();
            String g = transcript.get(i).getGrade();
            int credit = c.getCredit();
            sumCredit += credit;
            switch (g) {
                case "A":
                    sumGrade += 4*credit;
                    break;
                case "B+":
                    sumGrade += 3.5*credit;
                    break;
                case "B":
                    sumGrade += 3*credit;
                    break;
                case "C+":
                    sumGrade += 2.5*credit;
                    break;
                case "C":
                    sumGrade += 2*credit;
                    break;
                case "D+":
                    sumGrade += 1.5*credit;
                    break;
                case "D":
                    sumGrade += 1*credit;
                    break;
                case "F":
                    sumGrade += 0*credit;
                    break;
                default:
                    break;
            }
        }
        return sumGrade / sumCredit;
    }

    /**
     *
     * @return CourseGrade.toString()+\n until get all transcript
     */
    public String getAllTranscript() {
        String cg = "";
        for (int i = 0; i < transcript.size(); i++) {
            cg = cg + transcript.get(i).getCourse().getCid() + " "
                    + transcript.get(i).getCourse().getCname() + " "
                    + transcript.get(i).getCourse().getCredit() + " "
                    + transcript.get(i).getGrade();
            if (i!=transcript.size()-1){
                cg = cg + "\n";
            }
        }
        return cg;
    }
}
