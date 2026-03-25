   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textfilesassignment;


/**
 *
 * @author ASchultz2026
 */
        
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;  
import java.util.Scanner;

public class TextFilesAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter shortFormatter = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.SHORT)
            .withLocale(Locale.US); // Explicitly setting to US locale for consistent example
        
        // Format the LocalDateTime to a string
        String formattedDateTime = now.format(shortFormatter);
        String filePath = "TextFiles/contacts.txt";
        String outPath = "TextFiles/output.txt";
        String contentToWrite = "Armine Schultz, aschultz2026@cchsdons.com, 2026, aschultz2026.\n" + formattedDateTime;
       
    // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,
        true))) {
        //writer.write(contentToWrite);
        writer.append(contentToWrite + "\n");
        System.out.println("Successfully wrote to the file." +
        formattedDateTime);
        } catch (IOException e) {
        System.err.println("An error occurred while writing to the file: " +
        e.getMessage());
        }
        // Read from file
        try (BufferedReader reader = new BufferedReader(new
        FileReader(outPath))) {
        String line;
        System.out.println("\nReading from the file:");
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
        } catch (IOException e) {
        System.err.println("An error occurred while reading from the file: "
        + e.getMessage());
        }
        
        
        //bonus Scanner input 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter in name, email address, graduation year and username:");
        String input = scan.next();
        
        System.out.println("You entered:" + input);
    }

}
