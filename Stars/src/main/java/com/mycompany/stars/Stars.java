/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stars;

/**
 *
 * @author ASchultz2026
 */
public class Stars {

    public static void main(String[] args) {
        //final constants of  max and min number of rows
        final int MAX_ROWS = 10;
        final int MIN_ROWS = 0;
        
         //print a.
        System.out.println("a.");
        
        /*print out stars in order a
        a.
        **********
        *********
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *
        
        */
        for (int row = 10; row >= MIN_ROWS; row--)
        {
            //print out right # of stars for row
            for (int star = 1; star <= row; star++){
            System.out.print("*");
            }
            //new line for row
            System.out.println();
        }
        
        
        //print b.
        System.out.println("b.");
        
        /*print out stars in order b
                 *
                **
               ***
              ****
             *****
            ******
           *******
          ********
         *********
        **********
        
        */
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            //print out right # of spaces for row
            for(int space = 10; space >= row; space--)
                System.out.print(" ");
                    //print out right # of stars for row
                    for(int star = 1; star <= row; star++){
                        System.out.print("*");
                        }
            //new line for row
            System.out.println();
        }
        
        
        
        //print c.
        System.out.println("c.");
        
        /*print out stars in order c
         **********
          *********
           ********
            *******
             ******
              *****
               ****
                ***
                 **
                  *
        */
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            //print out right # of stars for row
            for (int space = 0; space <= row; space++)
                        System.out.print(" ");
                    //print out right # of spaces for row
                    for(int star = 10; star >= row; star--){
                        System.out.print("*");
                                }
            //new line for row
            System.out.println();
        
        }
        
        
        //print d.
        System.out.println("d.");
        //final constants of  max and min number of rows for d.
        final int MAX_ROWS_D = 4;
        final int MAX_ROWS_D2 = 4;
        
        
        /*print out stars in order d
            *
           ***  
          *****
         *******
        *********
        *********
         *******
          *****
           ***
            *
        */
        System.out.println("      *");
        for (int row = 1; row <= MAX_ROWS_D; row++)
        {
            //print out spaces
            for (int space = 5; space >= row; space--){
                System.out.print(" ");
            }
                    //print out stars
                    for (int star = 1; star <= row; star++){
                        System.out.print("***");
        }
            //new line for row
            System.out.println();
        }
        for (int row = 1; row <= MAX_ROWS_D2; row++)
        {
            //print out spaces
            for (int space = 0; space <= row; space++){
                System.out.print(" ");
            }
                    //print ou stars
                    for (int star = 4; star>= row; star--){
                        System.out.print("***");
                    }
            //new line for row
            System.out.println();
        }
        System.out.println("      *");
        }        
     
    }
