/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberproject;

//Import Scanner and Random
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ASchultz2026
 */
public class RandomNumberProject {

    public static void main(String[] args) {
        //declare random generator
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        
        //Part 1: Phone Number Generator
                
        //Declare numbers of phone    
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        int num8;
        int num9;
        int num10;
        
        //Attempt to loop, but didn't work
        //loop code if p is pressed
       /* int intIn;
        string p = p;
           while (p equals.notcase { */
       
            //Run each number through the random number generator
            num1 = generator.nextInt(7);
            num2 = generator.nextInt(7);
            num3 = generator.nextInt(7);
            num4 = generator.nextInt(6);
            num5 = generator.nextInt(5);
            num6 = generator.nextInt(5);
            num7 = generator.nextInt(8);
            num8 = generator.nextInt(9);
            num9 = generator.nextInt(9);
            num10 = generator.nextInt(9);
            
            //Print out "New Phone Number" and the new generated phone number
            System.out.println("Phone Number:" + num1 + num2 + num3 + "-" + num4+ num5 + num6 + "-" + num7 + num8 + num9 + num10);
            
            
           //Attempt to loop, but didn't work 
           /* System.out.println("Press p for new number");
            intIn = scan.nextInt();
            System.out.println("New Phone Number:" );
           }
           
                   
      
      
        
        //Part 2: 6 Sided Die Generator
        
        //Attempt to loop, but didn't work 
        //loop code if p is pressed
        /*int r =0;
        while (r < 1){*/
        
        
            //Declare Die
            int die;
            
            //run due through random numner generator
            die = generator.nextInt(6);
            
            //Print out generated die number
            System.out.println("Numbered rolled: " + die);
           
        }

    
 }
