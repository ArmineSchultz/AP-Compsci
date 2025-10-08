/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2_3;

/**
 *
 * @author ASchultz2026
 */
public class Assignment2_3 {

    public static void main(String[] args) {
    //Finding remainders for the following two equations
        System.out.println("3%2 = " + (3%2));
        System.out.println("4%2 = " + (4%2));
        
        
    /*Stating how many passengers per vechile and how much the gas
      costs per trip for each vechile*/
        int passengersCar = 4;
        System.out.println("Passengers per car: " + passengersCar);
        double $gasPrice = 4.00;
        System.out.println("Gas cost per car trip: $" + $gasPrice);
        double averagePriceCar = passengersCar/$gasPrice;
        System.out.println("Average price per passenger in car: $" + (averagePriceCar));
        int passengersBus = 24;
        System.out.println("Passengers per bus: " + passengersBus);
        $gasPrice = 8.50;
        System.out.println("Gas cost per bus trip: $" + $gasPrice);
        double averagePriceBus = passengersBus/$gasPrice;
        System.out.println("Average price per passenger in bus: $" + (averagePriceBus));
        
        
    //Finding result and remainder for following integers
        System.out.println("12/5 = " + (12/5));
        System.out.println("12%5 = " + (12%5));
        
        
    /*Calculating cost of tickets for 5 friends via int - when using
      int, you can lose some data when calculating*/
        int friends = 5;
        double $ticketPrice = 16.39;
        System.out.println( friends + " friends go see Superman, where tickets cost $" + $ticketPrice + " per person");
        System.out.println("The cost for all tickets is $" + (int)friends*$ticketPrice);
        
        
    //calculating 3/5, then cast answer as a float 
        System.out.println("3/5 =" + 3/5);
        System.out.println("Answer of 3/5: " + (float)3/5);
    /*Casting it as a float gives a decimal number answer; It gives a more
    accurate answer versus using int; the result w/o the cast = 0*/
    }
}
