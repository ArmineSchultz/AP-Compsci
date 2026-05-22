/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicgridpuzzle;

/**
 *
 * @author Owner
 */
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class LogicGridPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*implement scanner; string variables difficulty(easy/medium/hard)
        + theme(travel/crime/fantasy)*/
        Scanner scan = new Scanner(System.in);
        String theme, difficulty;
        String crime, fantasy;
        String easy, medium, hard;
        String instructionsPath = "NewGame/Instructions.txt";
        String themePath = "NewGame/Theme/ChooseTheme.txt";
        

            //read the instructions file to the game
            try(Scanner scanner = new Scanner(new File(instructionsPath))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }

            String input = scan.nextLine();
            //Begining a new game
            while (input.equalsIgnoreCase("n")){
            
            //read the theme file
            try(Scanner scanner = new Scanner(new File(themePath))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
            }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }
            System.out.println("Enter theme:");
            theme = scan.nextLine().toLowerCase();
            
            System.out.println("Enter difficulty:");
            difficulty = scan.nextLine().toLowerCase();
            
             String fileName = "";
    
             //Switch case for theme and their difficulties
             switch (theme){
                 case "crime":
                     switch (difficulty){
                        case "easy":
                            fileName = "NewGame/Theme/Crime/Easy1.txt";
                            break;
                        case "medium":
                            fileName = "NewGame/Theme/Crime/Medium1.txt";
                            break;
                        case "hard":
                            fileName = "NewGame/Theme/Crime/Hard1.txt";
                            break;
                        default:
                            System.out.println("Invaild theme and/or difficulty entered");
                            return;
                     }
                     break;
                
                 case "fantasy":
                     switch (difficulty){
                        case "easy":
                            fileName = "NewGame/Theme/Fantasy/Easy1.txt";
                            break;
                        case "medium":
                            fileName = "NewGame/Theme/Fantasy/Medium1.txt";
                            break;
                        case "hard":
                            fileName = "NewGame/Theme/Fantasy/Hard1.txt";
                            break;
                        default:
                            System.out.println("Invaild theme and/or difficulty entered");
                            return;
                     }
                     break;
             }
             
             try(Scanner scanner = new Scanner(new File(fileName))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
            }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage() + "with retrieving game file");
        }
             }
        }


            
            
           
    }

    //prompt to see highscores
         //ArrayList<Score> highscores = new ArrayList<>();
         
         //Score player = new Score();
         //highscore.add(player);
    

/*class Game{
    String difficulty, easy, medium, hard;
    String theme, travel, crime, fantasy;

    
    public Game(String inT,String inD){
        theme = inT;
        difficulty = inD;
    }
    
    @Override
    public void setDifficulty(String inD){
        difficulty = inD;
    }
    @Override
    public String getDifficulty(){
        return difficulty;
    }
    @Override
    public void setTheme(String inT){
        difficulty = inT;
    }
    @Override
    public String getTheme(){
        return difficulty;
    }
    
    public String prompt(){
        String result = "Difficulty choosen:" + difficulty + "\n" +
                "Theme choosen:" + theme;
        return result;
}
}

/*interface name{
    public void setName(String name);
    public String getName(String name);
}
class Score implements name{
    String highscore, name;
    int time = 0;
    
    public score(String inName, int inTime){
        name = inName;
        time = inTime;
    }
    
    @Override
    public void setName(String inN){
        name = inN;
    }
    
    public String getName(){
        return name;
    }
}*/