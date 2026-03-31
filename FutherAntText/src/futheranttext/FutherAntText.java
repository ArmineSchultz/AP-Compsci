/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futheranttext;

/**
 *
 * @author ASchultz2026
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;  
import java.util.Scanner;

public class FutherAntText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a File object represneting the file
        File file = new File("Contacts.txt");
        int intLine = 0;
        Scanner read;
        String a, e, y, n;
        String name = "";
        String email = "";
        String gradYear = "";
        String username = "";

        try(Scanner scanner = new Scanner(file)){
            String line = scaner.nextLine();
            if(intLine > 0)
                System.out.println(line);
            else{
                read = new Scanner(line);
                name = read.next();
                email = read.next();
                gradYear = read.next();
                username = read.next();
            }
            Contact c = new Contact(name, email, gradYear, username);
            System.out.println(c);
            intLine++;
        }
    }
    
}

class Contact{
    private String name = "";
    private String email = "";
    private String gradYear = "";
    private String username = "";
    
    public Contact(String n, String e, String year, String u) {
        name = n;
        email = e;
        gradYear = year;
        username = u;
        
    }
    
    public String toString(){
        String result = "";
            result = "Name:" + name + "\n" +
                    "Email:" + email + "\n" +
                    "Grad Year:" + gradYear + "\n" +
                    "Username:" + username;
            return result;
    }
}