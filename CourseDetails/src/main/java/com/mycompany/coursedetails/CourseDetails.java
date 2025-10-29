/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coursedetails;

/**
 *
 * @author ASchultz2026
 */
public class CourseDetails {

     public static void main(String[] args) {
        //Course Getter method full constructor printed out
        Course compSci = new Course("AP Computer Science A", "AP", 10, "Mr. Nelson");
        System.out.println(compSci);
        //Setter method full constructor printed out
        Course religon = new Course("Campus Ministry 12");
        religon.setCode("Normal");
        religon.setTotal(10);
        religon.setInstructor("Mrs.Shrimph");
        System.out.println(religon);

    }
}
class Course {
    //encap course title, code, pointsTotal and instructor
    private String title = "";
    private String code = "";
    private int pointsTotal = 0;
    private String instructor = "";
    
    //Getter Method full course constructor
    public Course(String inTitle, String inCode, int inTotal, String inInstructor) {
        title = inTitle;
        code = inCode;
        pointsTotal = inTotal;
        instructor = inInstructor;
    }
    
    //Setter method full constructor
    public void setCode(String inCode){
        code = inCode;
    }
    public void setTotal(int inTotal){
        pointsTotal = inTotal;
    }
    public void setInstructor(String inInstructor){
        instructor = inInstructor;
    }
    
    //Getter Method Name only course constructor
    public Course(String inTitle) {
        title = inTitle;
    }
    //Setter Method Name only course constructor
    public void setTitle(String inTitle){
        title = inTitle;
    }
    
    //toString method that returns a multi-line description of the course
    public String toString() {
            String result = "";
            result = "Course Title: " + title + "\n" +
                    "Course Code: " + code + "\n" +
                    "Points Total: " + pointsTotal + "\n" +
                    "Instructor Name: " + instructor +"\n";
            return result;
    }
}
