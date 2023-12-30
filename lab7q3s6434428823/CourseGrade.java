/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7q3s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class CourseGrade {

    private Course c;
    private String g;

    /**
     *
     * @param course
     * @param grade
     */
    public CourseGrade(Course course, String grade) {
        c = course;
        g = grade;
    }

    /**
     *
     * @return c: course
     */
    public Course getCourse() {
        return c;
    }

    /**
     *
     * @return g: grade
     */
    public String getGrade() {
        return g;
    }

    /**
     *
     * @return course grade
     */
    public String toString() {
        return c.toString() + " " + g;
    }

    /**
     *
     * @param obj2 : object2
     * @return true if both object equal
     */
    public boolean equals(CourseGrade obj2) {
        return c.equals(obj2.c) && g.equals(obj2.g);
    }
}
