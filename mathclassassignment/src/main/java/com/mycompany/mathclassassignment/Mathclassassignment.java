/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathclassassignment;

import static java.lang.Math.PI;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASchultz2026
 */
public class Mathclassassignment {

    public static void main(String[] args) {
        //Declare random number generator
        Random generator = new Random();
        
        //Step 1
        //declaring num, sine, cosine, and tangent
        int num;
        double sin;
        double cos;
        double tan;
        
        //random number picked
        num = generator.nextInt(90);
        System.out.println("1. Number: " + num);
        
        //random number run thru sin
        sin = (double) Math.sin(num);
        System.out.println("   Sine: " + roundAvoid((double) sin, (int) 3));
        
         //random number run thru cos
        cos = (double) Math.cos(num);
        System.out.println("   Cosine: " + roundAvoid((double) cos, (int) 3));
        
         //random number run thru tan
        tan = (double) Math.tan(num);
        System.out.println("   Tangent: " + roundAvoid((double) tan, (int) 3));
        
        
        
        //Step2
        //Stating double radiusArea
        double rArea;
        
        //generate new number from 1.0 to 20.0 double rArea;
        num = generator.nextInt((int) ((19.0)-1.0));
        System.out.println("2. Radius of circle:" + num);
        
        //random number run thru circle area formula: A = PIr^2
        rArea = (double) ((PI) * (Math.pow(num,2)));
        System.out.println("   Area circle(r):" + roundAvoid((double) rArea, (int) 3));
        
        
        
        //Step3
        //stating sqaure root(sqRt), natural log(nLog), and Log10 (log10)
        double sqRt;
        double nLog;
        double log10;
        
        //Generating random real number 1000.0 to 1,000,000.0
        num = generator.nextInt((int) ((9999000.0)+ 1000.0));
        System.out.println("3. Number(2): "+ num);
        
        //random number 2 run thru square root
        sqRt = (double) Math.sqrt(num);
        System.out.println("   Square root of number(2):" + roundAvoid((double) sqRt, (int) 5));
        
        //random number 2 run thru natural log
        nLog = (double) Math.log(num);
        System.out.println("   Natural Log of number(2):" + roundAvoid((double) nLog, (int) 5));
        
        //random number 2 run thru square root
        log10 = (double) Math.log10(num);
        System.out.println("   Log10 of number(2):" + roundAvoid((double) log10, (int) 5));
   
        
        
        //Step4
        //stating mass in grams and light constant(c)
        double mass;
        double c = 300000000;
   
        //Run random number 2 to calculate the mass required (in Grams) to generate energy(E=mc^2)
        mass = Math.pow(c,2);
        System.out.println("4. Grams required to produce energy(number 2):" + roundAvoid((double) log10, (int) 5)+ "g");
        
        
        
        //Step5
        //Declare scanner
        Scanner scan = new Scanner(System.in);
        
        //double Input and integer Input
        double dblIn;
        int intIn;
        double finalValue;
        int round;
        
        //Scan real number value entered
        System.out.println("5. Enter a real number value:");
        dblIn = scan.nextDouble();
       
        //Scan interger number entered
        System.out.println("   Enter a integer number:");
        intIn = scan.nextInt();
        
        //Scan interger number entered
        System.out.println("   Enter number to round:");
        round = scan.nextInt();
        
        //Output of the real number value entered to the power of the integer number entered
        finalValue = Math.pow(dblIn, intIn);
        finalValue = roundAvoid(finalValue, round);
        System.out.println("   Output of real number to power of integer:" + finalValue );
        
        
    }
    
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
