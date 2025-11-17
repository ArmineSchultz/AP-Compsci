/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystore;
import java.util.Scanner;

/**
 *
 * @author ASchultz2026
 */
public class MyStore {

    public static void main(String[] args) {
        /*Getter Method---print out the item name: t-shirt, shoes, 
        jeans, jacket, and their price*/
        Item tShirt = new Item("T-shirt", 29.99);
        System.out.println(tShirt);
        Item shoes = new Item("Shoes", 125.99);
        System.out.println(shoes);
        Item jeans = new Item("Jeans", 60.99);
        System.out.println(jeans);
        Item jacket = new Item("Jacket", 250.00);
        System.out.println(jacket);
        
        /*Setter Method---print out item name hat, shorts, blouse
        and their price*/
        Item hat = new Item("Hat");
        hat.setPrice(25.99);
        System.out.println(hat);
        Item shorts = new Item("Shorts");
        shorts.setPrice(75.99);
        System.out.println(shorts);
        Item blouse = new Item("Blouse");
        blouse.setPrice(88.99);
        System.out.println(blouse);
        
        
        //declare Scanner
        Scanner scan = new Scanner(System.in);
        //Max budget constant
        final double MAX_BUDGET = 250.00;
        //get the price of each item listed
        String item;
        double price = 0.00;
        double total = 0.00;
        //Ask the user to enter items
        System.out.println("Enter items (Budget $250.00):"); 
        
        //while loop that adds item price totals <= 250
        while (total < MAX_BUDGET){
            
        item = scan.next();
       
        getPrice item1 = new getPrice(item);
        System.out.println(item1);
        
            
        //add each item's price to a total, and increment a count
        System.out.println("You have spent $" + item);
        }
              System.out.println("You are over budget");
                }
        
        
    }

class Item{
    String strName = "";
    double dblPrice = 0.0;
    
    //full getter constructor of item name and price
    public Item(String inName, double inPrice) {
        strName = inName;
        dblPrice = inPrice;
    }
    
    //Name getter constructor of item name and price
    public Item(String inName) {
        strName = inName;
    }
    public void setName(String inName){
        strName = inName;
    }
    
    //full setter constructor of item name and price
     public void setPrice(double inPrice){
        dblPrice = inPrice;
    }
     
      //toString method that returns a multi-line description of the item
        public String toString1(){
            String result;
            result = "Item Name: " + strName + "\n" +
                    "Price: $" + dblPrice + "\n";
                    
            return result;
}
}
class getPrice{
    //private doubles for items and prices(tshirt,shoes,jeans,jacket,hat,shorts,blouse)
    private String itemName = "";
    private double price;
    
    public getPrice(String inName){
        itemName = inName;
        
        price = switch (inName) {
            case "tShirt" -> 29.99;
            case "Shoes" -> 125.99;
            case "Jeans" -> 60.99;
            case "Jacket" -> 250.00;
            case "Hat" -> 25.99;
            case "Shorts" -> 75.99;
            case "Blouse" -> 88.99;
            default -> 0.00;
        };
    }
    public void FindPrice(){
        
    }
    public double price (){
        double printPrice = price;
        
        return printPrice;
    }
    //toString method that returns a multi-line description of the item
        public String toString2(){
            String myString = "Item: " + itemName + "\n"
                    + "Total price is: $" + price;
            
            return myString;
        }
}