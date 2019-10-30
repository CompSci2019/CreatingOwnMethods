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

        int num1, num2, sum, product;    

        System.out.println("Enter the first number:");
        num1 = keyedInput.nextInt();       

        System.out.println("Enter the second number:");
        num2 = keyedInput.nextInt();         

        //sum = num1 + num2;
        //product = num1 * num2;       

        //System.out.println("The sum is: " + sum);
        //System.out.println("The product is: " + product);
        addAndOut(num1,num2);
        multAndOut(num1,num2);

    } 
    
    public static void addAndOut (int n1, int n2){
        int sum = n1+n2;
        System.out.println("The sum is " + sum);
    }
    
    public static void multAndOut (int n1, int n2){
        int product = n1*n2;
        System.out.println("The product is " + product);
    }
}