/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;

/**
 *
 * @author ASchultz2026
 */
import java.util.*;
public class ToDoList {

    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        
        String another = "y";
        ArrayList ToDoList = new ArrayList();
        int i = 1;
        
       
        //while command to add more tasks
        while (another.equalsIgnoreCase("y")){
            
            Task task1 = new Task();
            
            System.out.println("Enter in task to add to list:");
            task1.setTask(scan.next());
            
            System.out.println("Type in priority:");
            task1.setPriority(scan.nextInt());
            
            System.out.println("Type in complexity:");
            task1.setComplexity(scan.nextInt());
            
            ToDoList.add(task1);
            System.out.println("Would you like to enter another y/n:");
            another = scan.next();
            
        }

            //System.out.println("All tasks entered:" + ToDoList);
            Collections.sort(ToDoList);
            System.out.println(ToDoList);
        }

    }

interface Priority {
    public void setPriority(int priority);
    public int getPriority();
    //write if and statement 1-10 ranking urgency of task
    
}
interface Complexity {
    public void setComplexity(int complexity);
    public int getComplexity();
    //write if and statement 1-10 ranking dificulty of task
    
}
class Task implements Priority, Complexity, Comparable<Task>{
    private String toDo = "";
    private int priority = 0;
    private int complexity = 0;
    

    public Task(String inToDo){
        toDo = inToDo;

    }
    public Task(){
        toDo = "";

    }
    public void setTask(String t){
        toDo = t;
    }
    public int getPriority(){
        return priority;
    }
    public void setPriority(int inP){
        priority = inP;
    }
    public int getComplexity(){
        return complexity;
    }
    public void setComplexity(int inC){
        complexity = inC;
    }
    public int compareTo(Task otherTask){
        return Integer.compare(this.priority, otherTask.getPriority());
    }
//toString method that returns a multi-line des of task
    @Override
    public String toString(){
        String myString = "\n" + 
                "Task: " + toDo + "\n" +
                "Priority: " + priority + "\n" +
                "Complexity: " + complexity;

        return myString;
}
}