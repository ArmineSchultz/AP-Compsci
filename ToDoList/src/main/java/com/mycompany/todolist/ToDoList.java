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
        //task1
        Task task1 = new Task();
        String another = "y";
        ArrayList ToDoList = new ArrayList();
        
        System.out.println("Type in do-to tasks and their priority:");
        task1.setTask(scan.next());
        ToDoList.add(task1);
        System.out.println("Would you like to enter another y/n:");
        
        //while command to add more tasks
        while (another.equalsIgnoreCase("y"))
        {        
            //if (another == "y"){
            System.out.println("Enter in task to add to list:");
            task1.setTask(scan.next());
            ToDoList.add(task1);
            System.out.println("Would you like to enter another y/n:");
            another.scan.next();
            //    }else{
            //System.out.println("done");
        }

        }

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
        String myString = "Task:" + toDo;

        return myString;
}
}