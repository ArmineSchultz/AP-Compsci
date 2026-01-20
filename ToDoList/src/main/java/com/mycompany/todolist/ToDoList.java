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
        ArrayList ToDoList = new ArrayList();

        System.out.println("Type in do-to tasks and their priority:");
        //task1 = scan.next();
        //System.out.println(task1);
        
        //while command to add more tasks
        while (another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter in task to add to list:");
            task1.setTask(scan.next());
            
            ToDoList.add(task1);
        }
    }
}
interface Priority {
    void setPriority();
    //write if and statement 1-10 ranking urgency of task
    
}
interface Complexity {
    void setComplexity();
    //write if and statement 1-10 ranking dificulty of task
    
}
class Task implements Priority, Complexity{
    private String toDo = "";
    //private String addToDo = "y";
    

    public Task(String inToDo){
        toDo = inToDo;

    }
    public Task(){
        toDo = "";

    }
    public void setTask(String t){
        toDo = t;
    }
   

//toString method that returns a multi-line des of task
    @Override
    public String toString(){
        String myString = "Task:" + toDo;

        return myString;
}
}