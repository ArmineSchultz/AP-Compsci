/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package furtheranttext;

/**
 *
 * @author Owner
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FurtherAntText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, gradYear, username, email;
        String input = "";
        Scanner scan = new Scanner(System.in);
        
        
        String inPath = "TextFiles/Contacts.txt";
        
        ArrayList<Contacts> contactDetails = new ArrayList<>();
        

        
        while (!input.equalsIgnoreCase("exit")){
            
            if(!input.equalsIgnoreCase("a")){
                        System.out.println("Press a to add contact details. Type 'exit' to finish. ");
                        input = scan.nextLine();
                        continue;
            }
            System.out.println("Enter name:");
            name = scan.nextLine();
            System.out.println("Enter email:");
            email = scan.nextLine();
            System.out.println("Enter graduation year:");
            gradYear = scan.nextLine();
            System.out.println("Enter username:");
            username = scan.nextLine();
            Contacts info = new Contacts(name, email, gradYear, username);
            
            System.out.println("Enter 'a' if you want to add another contact, or type 'exit' finish.");
            contactDetails.add(info);
            input = scan.nextLine();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inPath, true))){
            for(Contacts c : contactDetails){
                writer.write(c.toString());
                writer.newLine();
            }
            
        }catch (IOException ex){
            System.err.println("Error writing to TextFiles:" + ex.getMessage());
        }
        
        List<Contacts> list = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader( new FileReader("TextFiles/Contacts.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                
                String[] values = line.split(",");
                
                if(values.length == 4){
                list.add(new Contacts(values[0], values[1], values[2], values[3]));
            }
            }
        }catch (IOException ex){
            System.err.println("Error writting to TextFiles:" + ex.getMessage());
        }
        
        
        
        System.out.println("""
                            Press e to sort by email address
                            Press y to sort by grad year
                            Press n to sort by name""");
        String sortBy = scan.next();
        
        switch (sortBy.toLowerCase()){
            case "e":
                list.sort(Comparator.comparing(Contacts::getName, String.CASE_INSENSITIVE_ORDER));
                break;
                
                case "y":
                list.sort(Comparator.comparing(Contacts::getEmail, String.CASE_INSENSITIVE_ORDER));
                break;

                case "n":
                list.sort(Comparator.comparing(Contacts::getGradYear, String.CASE_INSENSITIVE_ORDER));
                break;
                }
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}
    


class Contacts{
    String name, email, gradYear, username;
    
    public Contacts(String inName, String inEmail, String inYear, String inUser) {
        name = inName;
        email = inEmail;
        gradYear = inYear;
        username = inUser;   
    }
    public Contacts(){}
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getGradYear(){
        return gradYear;
    }
    public String getUsername(){
        return username;
    }
    
    public String toString(){
        String result = "";
            result = name + "," + email + "," + gradYear + "," + username;
            return result;
    }
}

