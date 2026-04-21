/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicgridpuzzle;

/**
 *
 * @author ASchultz2026
 */
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
        String game = "";
        String theme, travel, crime, fantasy;
        String difficulty, easy, medium, hard;

        String inPath = "NewGame/Theme/Difficulty.txt";
        

        
        while(input.equalsIgnoreCase("n")){
            System.out.println("""
                                    Logic Grid Puzzle
                              Press 'n' to begin New Game.
                              """);
            game = scan.nextLine();
            
            System.out.println("""
                                    Choose Theme
                              Type in choice of theme:
                                -Travel
                                -Crime
                                -Fantasy
                              """);
            theme = scan.nextLine();
            
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
         ArrayList<Score> highscores = new ArrayList<>();
    
}

interface difficulty{
    public void setDifficulty(String difficulty);
    public String getDifficulty();
    
}
interface theme{
    public void setTheme(String Theme);
    public String getTheme();
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

interface name{
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
}