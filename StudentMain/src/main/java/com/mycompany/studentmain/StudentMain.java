/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmain;
import java.util.*;
/**
 *
 * @author Owner
 */
public class StudentMain {

    public static void main(String args[]) {
       
        //scaner
        Scanner scan = new Scanner(System.in);
        
        //Strings first and last name
        String first, last;
        
        //prompt to enter in student's name
        System.out.println("Enter Student's first name:");
        first = scan.next();
        System.out.println("Enter Student's last name:");
        last = scan.next();
        
        //Student obj created
        Student st1 = new Student(first, last);
        
        //two line spaces
        System.out.println();
        System.out.println();
        
        //Print out info
        System.out.println("Student Records");
        System.out.println("Student: ");
        System.out.println(st1);
        System.out.println("Student Average is " + st1.getAverage());
        
    }
}
//basic class Student - should have 3 courses
class Student {
    private String firstName, lastName;
    public int average;
    
    //constructor to create empty Student object
    public Student(){
        firstName = "";
        lastName = "";
    }
    
    //constructor to create Student obj with name only
    public Student(String first, String last){
        firstName = first;
        lastName = last;
    }
    
    //needs a constructor to include 3 course objects
    Course english = new Course("English");
    Course math = new Course("Statistics");
    Course science = new Course("Physics");
    
    //set scores
    int eng = english.setScore(85);
    int mat = math.setScore(93);
    int sci = science.setScore(80);
    
    
    //get average
    public int getAverage(){
        average = (eng + mat + sci)/ 3;
        return average;
    }

  
   
    //basic toString code
    public String toString(){
        String result;
        result = firstName + " " + lastName + "\n"
                + english + " " + math + " " + science;
        return result;
    }

}
 

//class Course
class Course{
    public int score = 0;
    String courseName = "";
    
    //constructor for course name
    public Course(String name){
        courseName = name;
    }
    
    //set score
    public int setScore(int inScore){
        score = inScore;
        return score;
    }
    
    //getScore
    public int getScore(){
        return score;
    }
    
    
    //to string code
    public String toString(){
        String result;
        result = courseName + ":" + score;
                return result;
    }
}