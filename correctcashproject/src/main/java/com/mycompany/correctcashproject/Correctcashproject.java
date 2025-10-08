/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correctcashproject;

import java.util.Scanner;

/**
 *
 * @author ASchultz2026
 */
public class Correctcashproject {

    public static void main(String[] args) {
        
        //Setting up scanner
        Scanner scan = new Scanner(System.in);

        //Stating bills 
        int intTens;
        int intFives;
        int intOnes;
        
        //Stating cents
        int intQuater;
        int intDime;
        int intNickel;
        int intPenny; 
        
        //double Input
        double dblIn;
        
        //remainder
        double r;
        double dblPenny;
        
        //ask for input
        System.out.println("Enter price of item: ");
        dblIn = scan.nextDouble();
        System.out.println("Amount entered: ");
        System.out.println("Change: ");
       
        //need get correct number of tens
        intTens =(int)(dblIn/10);
        System.out.println("Tens: " + intTens);
        
        //fives
        r = (dblIn%10);
        intFives = (int)(r/5);
        System.out.println("Five: " + intFives);
        
        //ones
        r = (dblIn%5);
        intOnes = (int)(r/1);
        System.out.println("Ones: " + intOnes);
        
        //quaters
        r = (dblIn%1);
        intQuater = (int)(r/(0.25));
        System.out.println("Quaters: " + intQuater);
        
        //dimes
        r = (dblIn%(0.25));
        intDime = (int)(r/(0.10));
        System.out.println("Dimes: " + intDime);
        
        //nickels
        r = (dblIn%(0.10));
        intNickel = (int)(r/(0.05));
        System.out.println("Nickels: " + intNickel);
        
        //pennies
        r = (dblIn%(0.05));
        dblPenny = (r/(0.009));
        intPenny = (int)(dblPenny);
        System.out.println("Penny: " + intPenny);
       
        
}}
