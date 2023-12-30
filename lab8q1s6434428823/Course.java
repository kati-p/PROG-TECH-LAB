/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
import java.util.ArrayList;

public class Course {

    private String id, name;
    private int credit;
    private static int CourseCnt = 0;
    private static ArrayList<FacCount> FacCourses = new ArrayList<>();

    /**
     *
     * @param name
     * @param id
     */
    public Course(String name, String id) {
        this.name = name;
        this.id = id;
        credit = 3;
        CourseCnt++;
        FacCount fc = new FacCount(id);
        if (FacCourses.isEmpty()) {
            FacCourses.add(fc);
        } else {
            for (int i = 0; i < FacCourses.size(); i++) {
                if (FacCourses.get(i).getFacNum() == fc.getFacNum()) {
                    FacCourses.get(i).addCnt();
                } else if (i == FacCourses.size() - 1) {
                    FacCourses.add(fc);
                    break;
                }
            }

        }
    }

    /**
     *
     * @param name
     * @param id
     * @param credit
     */
    public Course(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
        CourseCnt++;
        FacCount fc = new FacCount(id);
        if (FacCourses.isEmpty()) {
            FacCourses.add(fc);
        } else {
            for (int i = 0; i < FacCourses.size(); i++) {
                if (FacCourses.get(i).getFacNum() == fc.getFacNum()) {
                    FacCourses.get(i).addCnt();
                } else if (i == FacCourses.size() - 1) {
                    FacCourses.add(fc);
                    break;
                }
            }

        }
    }

    /**
     *
     * @param id set id.
     */
    public void setCid(String id) {
        this.id = id;
    }

    /**
     *
     * @param name set name.
     */
    public void setCname(String name) {
        this.name = name;
    }

    /**
     *
     * @param credit set credit.
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     *
     * @return id.
     */
    public String getCid() {
        return id;
    }

    /**
     *
     * @return name.
     */
    public String getCname() {
        return name;
    }

    /**
     *
     * @return credit.
     */
    public int getCredit() {
        return credit;
    }

    /**
     *
     * @param c
     * @return true if both objects equal.
     */
    public boolean equals(Course c) {
        return name.equals(c.name) && id.equals(c.id) && credit == c.credit;
    }

    /**
     *
     * @param c
     * @return int 1-7.
     */
    public int compare(Course c) {
        boolean eN = name.equals(c.name);
        boolean eID = id.equals(c.id);
        boolean eC = credit == c.credit;
        if (eN && eID && eC) {
            return 0;
        } else if (eN && !eID && eC) {
            return 1;
        } else if (!eN && eID && eC) {
            return 2;
        } else if (eN && eID && !eC) {
            return 3;
        } else if (!eN && eID && !eC) {
            return 4;
        } else if (eN && !eID && !eC) {
            return 5;
        } else if (!eN && !eID && eC) {
            return 6;
        } else {
            return 7;
        }
    }

    /**
     *
     * @return String "name id credit".
     */
    public String toString() {
        return name + " " + id + " " + credit;
    }

    /**
     *
     * @param c
     * @return summarize of both courses
     */
    public int sumCredit(Course c) {
        return credit + c.credit;
    }

    /**
     *
     * @return Course count
     */
    public static int numberOfCourses() {
        return CourseCnt;
    }

    public static int numberOfFacCourses(int facultyCode) {
        for (int i = 0; i < FacCourses.size(); i++) {
            if (facultyCode == FacCourses.get(i).getFacNum()) {
                return FacCourses.get(i).getFacCnt();
            }
        }
        return 0;
    }
}
