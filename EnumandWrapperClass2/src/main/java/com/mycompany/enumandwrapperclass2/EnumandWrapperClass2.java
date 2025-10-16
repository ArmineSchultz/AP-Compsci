/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumandwrapperclass2;
import java.util.Scanner;
/**
 *
 * @author ASchultz2026
 */
public class EnumandWrapperClass2 {

    //create an enum of the weekdays
    enum Weekday {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    
    public static void main(String[] args) {
        //Weekday variables
        Weekday mon, tues, wed, thurs, fri, sat, sun;
        
        //enums that weekday variables correspond to
        mon = Weekday.Monday;
        tues = Weekday.Tuesday;
        wed = Weekday.Wednesday;
        thurs = Weekday.Thursday;
        fri = Weekday.Friday;
        sat = Weekday.Saturday;
        sun = Weekday.Sunday;
        
        //Ordinals for Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday
        System.out.println(mon + " is the "+ (mon.ordinal()+1) + "st day of the week");     
        System.out.println(tues + " is the " + (tues.ordinal()+1) + "nd day of the week");
        System.out.println(wed + " is the " + (wed.ordinal()+1) + "rd day of the week");
        System.out.println(thurs + " is the " + (thurs.ordinal()+1) + "th day of the week");
        System.out.println(fri + " is the " + (fri.ordinal()+1) + "th day of the week");
        System.out.println(sat + " is the " + (sat.ordinal()+1) + "th day of the week");         
        System.out.println(sun + " is the " + (sun.ordinal()+1) + "th day of the week");
        
        //space between weekdays and months
        System.out.println();
        
        
        //make enum for the months
        enum Month {January, Febuary, March, April, May, June, July, August, September, October, November, December}
        //Month variables
        Month jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec;
        
        ////enums that month variables correspond to
        jan = Month.January;
        feb = Month.Febuary;
        mar = Month.March;
        apr = Month.April;
        may = Month.May;
        jun = Month.June;
        jul = Month.July;
        aug = Month.August;
        sep = Month.September;
        oct = Month.October;
        nov = Month.November;
        dec = Month.December;
        
        //Ordinals for jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec
        System.out.println(jan + " is the " + (jan.ordinal()+1) + "st month in the year");
        System.out.println(feb + " is the " + (feb.ordinal()+1) + "nd month in the year");
        System.out.println(mar + " is the " + (mar.ordinal()+1) + "rd month in the year");
        System.out.println(apr + " is the " + (apr.ordinal()+1) + "th month in the year");
        System.out.println(may + " is the " + (may.ordinal()+1) + "th month in the year");
        System.out.println(jun + " is the " + (jun.ordinal()+1) + "th month in the year");
        System.out.println(jul + " is the " + (jul.ordinal()+1) + "th month in the year");
        System.out.println(aug + " is the " + (aug.ordinal()+1) + "th month in the year");
        System.out.println(sep + " is the " + (sep.ordinal()+1) + "th month in the year");
        System.out.println(oct + " is the " + (oct.ordinal()+1) + "th month in the year");
        System.out.println(nov + " is the " + (nov.ordinal()+1) + "th month in the year");
        System.out.println(dec + " is the " + (dec.ordinal()+1) + "th month in the year");
        
         
        //space between months and CCHS username
        System.out.println();
        
        //declare scanner
        Scanner scan = new Scanner(System.in);
        
        //state string for username and graduation year + integer for grad year
        String username, gradYear;
        int intGradYear;
        
        //write a main method that asks for your CCHS username
        //Ask for CCHS username and scan
        System.out.println("Enter your CCHS username:");
        username = scan.next();
                
        //get the graduation year from the username entered and print it
        gradYear = username.substring(username.length() - 4);
        System.out.println("Your grad year is: " + gradYear);
                
        //print the binary string version of the graduation year
        intGradYear = Integer.parseInt(gradYear);
        System.out.println("In computer language, you graduate in: " + (Integer.toBinaryString(intGradYear) + 1));
        
        }   
}

