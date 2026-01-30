/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;
//import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ASchultz2026
 */ 
public class Arrays {

    /*Write out an initialized array "weekDays" with all 7 days of the week. 
    Print the days of the week out, one day per row. Now resize the array to 5,
    and copy just the weekdays (so not Saturday or Sunday) to it, and print the 
    days again, one day per row. Comment your code where you are resizing it.

    For an extra bonus point, add a shuffling method, to change the order of the 
    days randolmly.
    */
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        final int WEEK = 7;
        String WEEKDAYS = "Monday", "Tuesday", "Wednesday", "Thursday", "Friday";
        int[] list = new int[WEEK];
        //initialize the array values
        for (int index = 0; index < WEEK; index++)
            list[index] = index * WEEKDAYS;
        list[5] = 999;
        //Print the array values
        for (int value : list)
            System.out.print(value + " ");
    }
}

