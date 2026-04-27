/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicgridpuzzle;

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


public class LogicGridPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*implement scanner; string variables difficulty(easy/medium/hard)
        + theme(travel/crime/fantasy)*/
        Scanner scan = new Scanner(System.in);
        String input = "";
        String travel, crime, fantasy;
        String easy, medium, hard;
        String instructionsPath = "NewGame/Instructions.txt";
        String themePath = "NewGame/Theme/ChooseTheme.txt";
        String difficultyPath = "NewGame/Theme/Travel/Difficulty/ChooseDifficulty.txt";
        
        
            //read the instructions file to the game
            try(Scanner scanner = new Scanner(new File(instructionsPath))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }
 
            String game = scan.nextLine();//scanning n
            
            //read the theme file
            try(Scanner scanner = new Scanner(new File(themePath))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
            }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }
 
            String theme = scan.nextLine();//scanning theme
            
            //switch case depending on theme choosen

        
            //read the dificulty file
             try(Scanner scanner = new Scanner(new File(difficultyPath))){
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
            }
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage());
        }
 
            String difficulty = scan.nextLine();//scanning difficulty  
            
            
        while(input.equalsIgnoreCase("n")){
            
            System.out.println("""
                                    Choose Difficulty
                              Type in choice of difficulty:
                                -Easy
                                -Medium
                                -Hard
                              """);
            difficulty = scan.nextLine();
            
            Game newGame = new Game(theme, difficulty);
            System.out.println(newGame);
    }

    
    }

    //prompt to see highscores
         //ArrayList<Score> highscores = new ArrayList<>();
         
         //Score player = new Score();
         //highscore.add(player);
    
}

interface difficulty{
    public void setDifficulty(String difficulty);
    public String getDifficulty();
    
}
interface theme{
    private String Theme = "";
    
    public void setTheme(String Theme);
    public String getTheme();
    
    switch(inT.equalsIgnoreCase()){
        case "Travel":
            difficulty path;
            break;
        case "Crime":
            difficulty path;
            break;
        case "Fantasy" :
            difficulty path;
            break; 
    }
}

class Game implements difficulty, theme{
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