/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicgridpuzzle;

/**
 *
 * @author Owner
 */
import java.awt.*;
import javax.swing.*;

import javax.sound.sampled.*;
import java.util.Timer;
import java.util.TimerTask;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class LogicGridPuzzle extends JPanel{
    public LogicGridPuzzle(){
        super();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameWindow());
        /*implement scanner; string variables difficulty(easy/medium/hard)
        + theme(crime/fantasy)*/
        Scanner scan = new Scanner(System.in);
        GameWindow window = new GameWindow();
        String theme, difficulty;
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


            //Begining a new game
            while (scan.nextLine().equalsIgnoreCase("n")){
            
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
                    window.showPanel(theme, difficulty);
            }catch (IOException e){
            System.err.println("An error occurred" + e.getMessage() + "with retrieving game file");
        }
             }
        }      
    }


class GameWindow{
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout layout;
    
    private HashMap<String, JPanel> panels = new HashMap<>();
    
    public GameWindow(){
        frame = new JFrame("Grid Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        
        layout = new CardLayout();
        cardPanel = new JPanel(layout);
        
        //pre-made panels
        panels.put("crime_easy1",
                new PuzzlePanel(
                    this,
                    "crime",
                    "easy",
                    1,
                    "crime_easy2"));
        
        panels.put("crime_easy2",
            new PuzzlePanel(
                this,
                "crime",
                "easy",
                2,
                "crime_medium1"));
        panels.put("crime_medium1",
                new PuzzlePanel(
                    this,
                    "crime",
                    "medium",
                    1,
                    "crime_medium2"));
        panels.put("crime_medium2",
            new PuzzlePanel(
                this,
                "crime",
                "medium",
                2,
                "crime_hard1"));
        panels.put("crime_hard1",
                new PuzzlePanel(
                    this,
                    "crime",
                    "hard",
                    1,
                    "crime_hard2"));
        
        
        panels.put("fantasy_easy1",
                new PuzzlePanel(
                    this,
                    "fantasy",
                    "easy",
                    1,
                    "fantasy_easy2"));
        panels.put("fantasy_easy2",
                new PuzzlePanel(
                    this,
                    "fantasy",
                    "easy",
                    2,
                    "fantasy_medium1"));
        panels.put("fantasy_medium1",
                new PuzzlePanel(
                    this,
                    "fantasy",
                    "medium",
                    1,
                    "fantasy_medium2"));
        panels.put("fantasy_medium2",
                new PuzzlePanel(
                    this,
                    "fantasy",
                    "medium",
                    2,
                    "fantasy_hard1"));
        panels.put("fantasy_hard1",
                new PuzzlePanel(
                    this,
                    "fantasy",
                    "hard",
                    1,
                    "fantasy_hard2"));
        
        //add them to the card layout
        for (String key : panels.keySet()){
            cardPanel.add(panels.get(key), key);
        }
        frame.setContentPane(cardPanel);
        frame.setVisible(true);
    }
        public void showPanel(String theme, String difficulty){
            String key =  theme + "_" + difficulty + "1";
            
            if (panels.containsKey(key)){
            layout.show(cardPanel, key);
        }else{
                System.out.println("Missing panel: " + key);
            }
}
        public void loadLevel(String theme, String difficulty, String fileName){
            
            showPanel(theme, difficulty);
            
            try (Scanner scanner = new Scanner(new File(fileName))){
                System.out.println("\n *** NEW LEVEL ***");
                
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            }catch (IOException e){
                System.out.println("Error loading level file" + e.getMessage());
            }
        
           
        }
        public void showPanelByKey(String key) {

    if (panels.containsKey(key)) {

        layout.show(cardPanel, key);

    } else {

        System.out.println("Missing panel: " + key);
    }
}
}

//class for different game panels based on theme and difficulty
class PuzzlePanel extends JPanel {

    private Cell[] cells = new Cell[100];

    private boolean gameWon = false;

    private GameWindow window;
    private String theme;
    private String difficulty;
    private String nextLevelKey;
    private int levelNumber;

    public PuzzlePanel(GameWindow window, String theme,
            String difficulty, int levelNumber, String nextLevelKey) {
        this.window = window;
        this.theme = theme;
        this.difficulty = difficulty;
        this.levelNumber = levelNumber;
        this.nextLevelKey = nextLevelKey;

        setLayout(new GridLayout(10, 10));

        for (int i = 0; i < 100; i++) {

            cells[i] = new Cell(this::checkWin);
        add(cells[i]);
        }
    }

    private void checkWin() {

        if (gameWon) return;

        for (Cell c : cells) {

            if (c.getState() == 0) {
                return;
            }
        }

        gameWon = true;

        showWinPopup();
    }

    private void showWinPopup() {

        int choice = JOptionPane.showOptionDialog(
                this,
                "You solved the puzzle!",
                "Win!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Next Level", "New Game"},
               "Next Level"
        );

        if (choice == 0) {
            goToNextLevel();
        } else {
            restartGame();
        }
    }

    private void goToNextLevel() {

        if (nextLevelKey == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "You beat the final level!"
            );

            return;
        }

        window.showPanelByKey(nextLevelKey);

        printCluesForLevel(nextLevelKey);
    }

    private void restartGame() {

        window.showPanel(theme + "_easy1" );
    }

    private void printCluesForLevel(String levelKey) {
        String[] parts = levelKey.split("_");
        String nextTheme = parts[0];
        String nextDifficulty = parts[1];
        String levelPart = parts[2];

    String levelNumber =
            levelPart.replaceAll("[^0-9]", "");

    String filePath =
            "NewGame/Theme/"
            + capitalize(nextTheme)
            + "/"
            + capitalize(nextDifficulty)
            + levelNumber
            + ".txt";

        try (Scanner scanner =
                     new Scanner(new File(filePath))) {

            System.out.println("\n*** NEXT LEVEL ***");
            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private String capitalize(String word) {

        return word.substring(0, 1).toUpperCase()
                + word.substring(1);
    }
}
//inner class for each grid cell
class Cell extends JButton {
        private int state = 0; // 0 = blank, 1 = X, 2 = O
        private Runnable checkWinCallback;
        
        public Cell(Runnable checkWinCallback) {
        this.checkWinCallback = checkWinCallback;

        setFont(new Font("Arial", Font.BOLD, 20));

        addActionListener(e -> {
            state = (state + 1) % 3;
            updateDisplay();
            checkWinCallback.run(); // check win after every click
            SoundClass.playSound("izafi-gold-coin-sound-437271.wav");
        });

        updateDisplay();
    }
        public int getState() {
            return state;
        }

        private void updateDisplay() {
            switch (state) {
                case 0 -> setText("");
                case 1 -> setText("X");
                case 2 -> setText("O");
            }
        }
    }
class SoundClass{
String soundPath = "/logicgridpuzzle/izafi-gold-coin-sound-437271.wav"; 
//syntax for playing sounds
public static void playSound(String soundPath) {
    try {
        AudioInputStream audioIn =
            AudioSystem.getAudioInputStream(
            SoundClass.class.getResource(soundPath));
            
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.setFramePosition(0);
        clip.start();
        // Keep the program running until the sound finishes playing
        clip.addLineListener(event -> {
        if (event.getType() == LineEvent.Type.STOP) {
        clip.close();
        }
    });
} catch (UnsupportedAudioFileException | IOException |
LineUnavailableException e) {
e.printStackTrace();
}
}
public void createTimeForSound() {
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            playSound(soundPath);
            System.out.println("Task performed on: " + new Date() + "n" +
            "Thread's name: " + Thread.currentThread().getName());
}
};
        
Timer timer = new Timer("Timer");
//1000 miliseconds, aka 1 second. Your clip may require more time.
long delay = 1000L;
timer.schedule(task, delay);
}
}