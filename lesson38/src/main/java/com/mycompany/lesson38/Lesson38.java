/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lesson38;

import java.util.Scanner;

/**
 *
 * @author ASchultz2026
 */
public class Lesson38 {

    //declare scanner
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // monthly Payment and interest
        double mPayment;

        //input financial amount
        System.out.println("Input financial amount:");
        double input = scan.nextDouble(); 
        //ask for # of months
        System.out.println("Number of months for repayment:");
        int months = scan.nextInt(); 
        //call on InterestRateCalculator class + run input and months through getMonthlyPayment
        InterestRateCalculator irc = new InterestRateCalculator(input, months);
        mPayment = irc.getMonthlyPayment();
        System.out.println("Monthly payment:" + mPayment);
        System.out.println("Repaid over "+ months + " months");
       
    }  
}
class InterestRateCalculator {
   //total input, monthly Payment, interest, months
   private double input = 0.0;
   private int months = 0;
   
   //full constructor
   public InterestRateCalculator(double inInput, int inMonths) {
       input = inInput;
       months = inMonths;
       
   }
   //runs input and months through getMonthlyPayment to return back amount paid each month
   public double getMonthlyPayment(){
    double RATE = 0.10;
    double mPayment = (input/months);
    double interest = mPayment*RATE;
    return (mPayment + interest);
}
   
}
