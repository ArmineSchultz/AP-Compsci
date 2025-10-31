/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyear;
import java.util.Scanner;
/**
 *
 * @author ASchultz2026
 */
public class LeapYear {

    public static void main(String[] args) {
        //Declare scanner
        Scanner scan = new Scanner(System.in);
        boolean isLeapYear = false;
        
        //final int yearstart
        final int START = 1582;
        
        //ask for year input
        System.out.println("Enter a random year number:");
        int year = scan.nextInt();
        System.out.println("You entered:" + year);
        
        //year entered is a leap year of it is divisible by 4
        if(year < START){
            System.out.println("ERROR. The year you have entered is not within the Gregorian Calender.");
        }else{
            if (year%4 == 0){
            if (year%100 == 0){
            if (year%400 == 0){
            isLeapYear = true;
        }else{
             isLeapYear = false;
        }
            }else{
             isLeapYear = true;
        }
        }else{
             isLeapYear = false;
        }
    }
        if (isLeapYear == true){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        } 
    }
}
