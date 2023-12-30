/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q1s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class FacCount {

    private int facNum;
    private int facCnt;

    /**
     * 
     * @param cId - course id
     */
    public FacCount(String cId) {
        facNum = Integer.parseInt(cId.substring(0, 2));
        facCnt = 1;
    }
    /**
     * - count + 1
     */
    public void addCnt() {
        facCnt++;
    }

    /**
     *
     * @return faculty number
     */
    public int getFacNum() {
        return facNum;
    }

    /**
     *
     * @return faculty count
     */
    public int getFacCnt() {
        return facCnt;
    }

    /**
     *
     * @param facC
     * @return true if both FacCourse equal
     */
    public boolean equals(FacCount facC) {
        return facNum == facC.facNum && facCnt == facC.facNum;
    }

    /**
     *
     * @return "facNum facCnt"
     */
    public String toString() {
        return facNum + " " + facCnt;
    }
}
