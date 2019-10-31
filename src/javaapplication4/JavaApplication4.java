/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Scanner;

public class JavaApplication4  {   

    public static void main(String[] args) {

        Scanner keyedInput = new Scanner (System.in);    

        int num1, num2;  
        int option = 0;
        do {
            System.out.println("Menu");
            System.out.println("____");
            System.out.println("1. Add the numbers together");
            System.out.println("2. Multiply the numbers together");
            option = keyedInput.nextInt();
            if (option==1){
                System.out.println("Enter the first number:");
                num1 = keyedInput.nextInt();
                System.out.println("Enter the second number:");
                num2 = keyedInput.nextInt();
                System.out.println("The answer is " + addAndOut(num1,num2));
            }
            else if (option==2){
                System.out.println("Enter the first number:");
                num1 = keyedInput.nextInt();
                System.out.println("Enter the second number:");
                num2 = keyedInput.nextInt(); 
                System.out.println("The answer is " + multAndOut(num1,num2) );
            }
            
        } while(option !=-1);
    } 
    
    public static int addAndOut (int n1, int n2){
        int sum = n1+n2;
        //System.out.println("The sum is " + sum);
        return sum;
    }
    
    public static int multAndOut (int n1, int n2){
        int product = n1*n2;
        //System.out.println("The product is " + product);
        return product;
    }
}