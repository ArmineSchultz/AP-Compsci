/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lgp;

/**
 *
 * @author ASchultz2026
 */
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class LGP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*implement scanner; string variables difficulty(easy/medium/hard)
        + theme(crime/fantasy)*/
        Scanner scan = new Scanner(System.in);
        String input = "";
        String crime, fantasy;
        String easy, medium, hard;
        String instructionsPath = "NewGame/Instructions.txt";
        String themePath = "NewGame/Theme/ChooseTheme.txt";
        
        String easyFantasy = "NewGame/Theme/Fantasy/Easy1.txt";
        String mediumFantasy = "NewGame/Theme/Fantasy/Medium1.txt";
        String hardFantasy = "NewGame/Theme/Fantasy/Hard1.txt";
        
        String easyCrime = "NewGame/Theme/Crime/Easy1.txt";
        String mediumCrime = "NewGame/Theme/Crime/Medium1.txt";
        String hardCrime = "NewGame/Theme/Crime/Hard1.txt";
        
            try(Scanner scanner = new Scanner(new File(instructionsPath))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }
               while (input.equalsIgnoreCase("n")){
            String game = scan.nextLine();//scanning n
            System.out.println(game);
            //read the theme file
            try(Scanner scanner = new Scanner(new File(themePath))){
                System.out.println("In themePath");
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
            }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }
             String theme = scan.nextLine();//scanning theme
        }
    }
    
}
