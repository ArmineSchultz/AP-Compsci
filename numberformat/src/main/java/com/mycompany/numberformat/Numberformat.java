/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberformat;
import static java.lang.Math.PI;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
/**
 *
 * @author ASchultz2026
 */
public class Numberformat {

    public static void main(String[] args) {
        //Decalre scanner
        Scanner scan = new Scanner(System.in);
        
        //Number 1
        //integer input total and integer input of females
        double intTotal; 
        double intFemale;
        double intMale;
        //stating varibles female percent and male percent
        double fPercent;
        double mPercent;
        
        
        //Ask to enter number of students ar a school + scan
        System.out.println("1. Enter number of students at school:");
        intTotal = scan.nextInt();
        //ask for number of girls at the school
        System.out.println("   Number of girls at school:");
        intFemale = scan.nextInt();
        
        //output the percent of girls at school
        fPercent = (int)((intFemale/intTotal)*100);
        System.out.println("   Percent of girls at school:" + fPercent);
        
        //output the percent of boys at school
        intMale = (int) intTotal-intFemale;
        mPercent = (int)((intMale/intTotal)*100);
        System.out.println("   Percent of boys at school:" + mPercent);
        
        
       
        //Number 2
        //double input of dollars, pounds and euros
        double dollars, pounds, euros;
        //String input of dollars, pounds and euros
        String strDol, strPou, strEur;
        
        
        //Ask to input an money in dollars + cents
        System.out.println("2. Enter in number of dollars and cents:");
        dollars = scan.nextDouble();
        
        //Money in US currency
        NumberFormat formatdollars = NumberFormat.getCurrencyInstance(Locale.US);
        strDol = formatdollars.format(dollars);
        System.out.println("In U.S. dollars: " + strDol);
        
        //Convert US money into Pounds
        NumberFormat formatpounds = NumberFormat.getCurrencyInstance(Locale.UK);
        pounds = dollars * (0.75);
        strPou = formatpounds.format(pounds);
        System.out.println("Converted to Pounds: " + strPou);
        
        //Convert US money into Euros
        NumberFormat formateuros = NumberFormat.getCurrencyInstance(Locale.ITALY);
        euros = dollars * (0.86);
        strEur = formateuros.format(euros);
        System.out.println("Converted to Pounds: " + strEur);
      
        
        
                         
        
        //Number 3
        //rounding integer input from numbers 0 to 15, finalValue/Pi stated
        int round;
        double finalValue;
        
        //Ask to input number 0 to 15
        System.out.println("3. Input a number from 0 to 15:");
        round = scan.nextInt();
        
        //round digit of pi to the inetger entered
        finalValue = roundAvoid(PI, round);
        System.out.println("   Pi rounded to number entered:" + finalValue);
        
        
        
        //Number 4
        /* Generate a random number from 100,000,000 to 999e18as a decimal
        number (no scientific notation)*/
        //Declare random number generator
        Random generator = new Random();
        //state random decimal number
        double num;
        
        //generate a random number
        num = generator.nextInt(1000000000);
        
        //Print out random number in decimal format
        java.text.DecimalFormat df = new java.text.DecimalFormat("#,###,###,###.##");
        System.out.println("4. Number:" + df.format(num));
        
        
                
    }
    
    
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

}