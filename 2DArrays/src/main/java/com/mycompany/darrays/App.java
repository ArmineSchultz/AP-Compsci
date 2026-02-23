/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.darrays;
import java.util.*;
/**
 *
 * @author Owner
 */
public class App {

    public static void main(String[] args) {
        //new deck of cards no values
        int[][] deck = new int[4][13];
        //declare random- to randomly select cards
        Random num = new Random();
        int SUIT = 4;
        int VALUE = 13;
        
        //add values to cards
        for (int suit = 0; suit < deck.length; suit++){
            for (int val = 0; val < deck[suit].length; val++ )
                deck[suit][val] = val + 1;
        }
        
        //print out entire deck
        for (int suit = 0; suit < deck.length; suit++){
            for (int val = 0; val < deck[suit].length; val++ ){
                switch (suit){
                    case 0:
                        System.out.print(deck[suit][val] + " of hearts" + "\t");
                        break;
                    case 1:
                        System.out.print(deck[suit][val] + " of spades" + "\t");
                        break;
                    case 2:
                        System.out.print(deck[suit][val] + " of diamonds" + "\t");
                        break;
                    case 3:
                        System.out.print(deck[suit][val] +" of clubs" + "\t");
                        break;
                    default:
                        System.out.print("cards");
                }
            }
            
            //space
            System.out.println();
            System.out.println();
        }
        //1st hand
        System.out.println("First hand of cards is:");
        
        for (int i = 0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
            
            
            //switch case same as entire deck w/ [one][two]
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] +" of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
            }
        }

        //space
        System.out.println();
        System.out.println();
        
        //2nd hand
        System.out.println("Second hand of cards is:");
        
        for (int i = 0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
            
            
            //switch case same as entire deck w/ [one][two]
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] +" of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
            }
        }
        
        
         //space
        System.out.println();
        System.out.println();
        
        //3rd hand
        System.out.println("Third hand of cards is:");
        
        for (int i = 0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
            
            
            //switch case same as entire deck w/ [one][two]
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] +" of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
            }
        }
        
         //space
        System.out.println();
        System.out.println();
        
        //4th hand
        System.out.println("Fourth hand of cards is:");
        
        for (int i = 0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
            
            
            //switch case same as entire deck w/ [one][two]
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] +" of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
            }
        }
    }
    }

