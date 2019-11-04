/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Scanner;

public class JavaApplication4  {   
    static Scanner keyedInput = new Scanner (System.in); 
    static int num1, num2;
    static int option = 0;
    public static void main(String[] args) {
        
        do {
            System.out.println("Menu");
            System.out.println("____");
            System.out.println("1. Add the numbers together");
            System.out.println("2. Multiply the numbers together");
            System.out.println("Enter -1 to exit");
            option = keyedInput.nextInt();
            if (option==1){
                getUserInput();
                System.out.println("The answer is " + addAndOut(num1,num2));
            }
            else if (option==2){
                getUserInput(); 
                System.out.println("The answer is " + multAndOut(num1,num2) );
            }
            
        } while(option !=-1);
    } 
    public static void getUserInput(){
        System.out.println("Enter the first number:");
        num1 = keyedInput.nextInt();
        System.out.println("Enter the second number:");
        num2 = keyedInput.nextInt(); 
    }
    /**
     * addAndOut() accepts two parameters to be added together and returned 
     * to the calling method
     * @param n1 
     * @param n2
     * @return sum of the numbers
     */
    public static int addAndOut (int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
    /**
     * nultAndOut() accepts two parameters to be multiplied together and returned 
     * to the calling method
     * @param n1
     * @param n2
     * @return product of the numbers
     */
    public static int multAndOut (int n1, int n2){
        int product = n1*n2;
        return product;
    }
}