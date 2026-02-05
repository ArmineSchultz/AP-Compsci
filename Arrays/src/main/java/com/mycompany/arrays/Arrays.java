/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;


/**
 *
 * @author Owner
 */
public class Arrays {

    public static void main(String[] args) {
        
        final int WEEK = 7;
        
        String[] week = new String[WEEK];
        String[] weekdays;
        String[] shuffle;
        
        //initialise the array values
        for (int i = 0; i < WEEK; i++){
            switch(i){
                case 0:
                    week[i] = "Monday";
                    break;
                case 1:
                    week[i] = "Tuesday";
                    break;
                case 2:
                    week[i] = "Wednesday";
                    break;
                case 3:
                    week[i] = "Thursday";
                    break;
                case 4:
                    week[i] = "Friday";
                    break;
                case 5:
                    week[i] = "Saturday";
                    break;
                case 6:
                    week[i] = "Sunday";
                    break;
                default:
                    week[i] = "Sunday";   
              }
        }
        
        //print out all days of the week
        System.out.println("The days of the week are:");
        for (int index = 0; index < week.length; index++){
            System.out.println(week[index]);
        }
        
        //only weekdays
        weekdays = new String[5];
        //copy current array into weekdays
        for(int j =0; j < 5; j++){
            weekdays[j] = week[j];
        }
        
        //space
        System.out.println();
        //print out weekdays
        System.out.println("The weekdays are:");
        for (int index = 0; index <= weekdays.length - 1; index++){
            System.out.println(weekdays[index]);
        }
        
    }
}
