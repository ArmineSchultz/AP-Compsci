/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.string_objects_assignment;

/**
 *
 * @author ASchultz2026
 */
public class String_objects_assignment {

    public static void main(String[] args) {
        //creating method for my name, Armine Schultz
        String name = new String("Armine Schultz");
        System.out.println("My name is " + name);
        
        //printing out name length
        System.out.println("My name length is " + name.length());
        
        //Printing name in upper case
        System.out.println("My name in upper case is " + name.toUpperCase());
        
        //Printing name in lower case
        System.out.println("My name is lower case is " + name.toLowerCase());
        
        //First letter of name
        System.out.println("The first letter in my name is " + name.charAt(0));
        
        //Last letter of name
        System.out.println("The last letter in my name is " + name.charAt(name.length()-1));
        
        //Index of space
        System.out.println("The index of space between the names is " + name.indexOf(" "));
        
        
    }
}
