/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmain;

/**
 *
 * @author ASchultz2026
 */
public class StudentMain {

    //public class
    public static void main(String args[]) {
        Student st1 = new Student("Bob", "Smith");
        //doesn't do anything right now
    }
}
//basic class Student - should have 3 courses
class Student {
    private String firstName, lastName;
    Course c1 = new Course();
    int s = c1.setScore(85);
    
    //empty constructor to create empty Student object
    public Student(){
        firstName = "";
        lastName = "";
    }
    
    //basic constructor to create Student oject with name only
    public Student(String first, String last){
        firstName = first;
        lastName = last;
    }
    
    //needs a constructor to include 3 course objects
    
    //basic toString code
    public String toString(){
        String result;
        result = firstName + " " + lastName + "\n";
        return result;
    }
    
    public int getScore(){
        return score;
    }
}