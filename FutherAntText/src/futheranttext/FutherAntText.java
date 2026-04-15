/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futheranttext;

/**
 *
 * @author ASchultz2026
 */

import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FutherAntText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int intLine = 0;
        Scanner read;
        String a, e, y, n;
        String name = "";
        String email = "";
        String gradYear = "";

        Scanner scan = new Scanner(System.in);
        String inPath = "TextFiles/input.txt";
        String outPath = "TextFiles/ordered.txt";
        
        System.out.println("""
                            Press a to add contact details 
                            Press e to order by email address
                            Press y to order by grad year
                            Press n to order by name""");
        
        try(PrintWriter writer = new PrintWriter(new FileWriter(inPath,
            true))){
            while(true){
                String input = scan.nextLine().trim();
                
            String line = scan.nextLine();
            //if user enters a
            if(intLine > 0)
                System.out.println(line);
            else{
                read = new Scanner(line);
                name = read.next();
                email = read.next();
                gradYear = read.next();
            }
            Contact c = new Contact(name, email, gradYear);
            System.out.println(c);
            intLine++; 
            
            //if user enters e
            
            //if user enters y
            
            //if user enters n
            
                if(input.equalsIgnoreCase("DONE")){
                    break;
                }
                writer.println(input);
            }
                System.out.println("Data Saved to" + inPath);
        }catch (IOException ex){
            System.err.println("Error writing to file:" + ex.getMessage());
        }finally{
                scan.close();
                }
        }
    }
    


class Contact{
    private String name = "";
    private String email = "";
    private String gradYear = "";
    
    public Contact(String n, String e, String year) {
        name = n;
        email = e;
        gradYear = year;

        
    }
    
    public String toString(){
        String result = "";
            result = "Name:" + name + "\n" +
                    "Email:" + email + "\n" +
                    "Grad Year:" + gradYear;
            return result;
    }
}

class Order{
    private String name, email, year;
    private String e, y, n;
    public static void selectionOrder()
    {
        
    }
    public String compareTo(Object other)
    {
        String result;
        String otherName = ((Contact)other).getName;
        String otherEmail = ((Contact)other).getEmail;
        String otherYear = ((Contact)other).getYear;
        
        if (){
            
        }
        return result;
    }
    public String getName()
    {
        return n;
    }
    public String getEmail()
    {
        return e;
    }
    public String getYear()
    {
        return y;
    }
}