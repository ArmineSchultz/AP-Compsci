/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascaltriangle;
import java.util.*;
/**
 *
 * @author Owner
 */
public class Pascaltriangle {

    public static void main(String[] args) {
        //scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt to enter in number of rows
        System.out.println("Enter in number of rows wanted for Pascal's Triangle:");
        int n = scan.nextInt();
        
        //array for triangle w/ n number of rows
        int[][]triangle = new int[n][];
        
        /*creating pascal's triangle: each number is the sum of the
        two numbers above it*/
        for(int i = 0; i < n; i++){
            triangle[i] = new int[i+1];
            
            for (int j = 0; j <= i; j++){
                if (j==0 || j ==i){
                    triangle[i][j] = 1;
                }else{
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }
        //printing out array in triangel format 
        System.out.println("Pascal's Triangle with " + n + " number of rows:");
        
        for(int i = 0; i < n; i++){
            
            for(int k = 0; k < n-i; k++){
                System.out.println(" ");
            }
            
            for(int j = 0; j< i; j++){
                System.out.printf("%6d", triangle[i][j]);
            }
            //empty line b/t each value row
            System.out.println();
        }
    }
}
