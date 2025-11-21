/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASchultz2026
 */
public class ShoppingList {

    public static void main(String[] args) {
        //declare scanner
        Scanner scan = new Scanner(System.in);
        
        //string variables item, another(add anoher item), clear(remove an item)
        String item;
        String another = "y";
        int clear;
        ArrayList<String> ShoppingList = new ArrayList<>();
        
        
       //create a while loop that asks user to input a shopping list item
        while (another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter an Item to add to the shopping:");
            item = scan.next();
            
            
            ShoppingList.add(item);
            //Ask user if they would like to add another item
            System.out.println("Add another item? y/n");
            another = scan.next();
        }
        
        //user can choose to remove items
        System.out.println("Would you like to remove any item? y/n");
        another = scan.next();
        while (another.equalsIgnoreCase("y"))
        {
            //ask user number of items they want to remove
            System.out.println("Enter number of item to remove:");
            clear = scan.nextInt();
            ShoppingList.remove((clear-1));
            System.out.println(ShoppingList);
            
            //ask user if they want to remove anoher item
            System.out.println();
            System.out.println("Remove another item? y/n");
            another = scan.next();
        }
        
        System.out.println("Your Shopping List is:" + ShoppingList);
    }
}
