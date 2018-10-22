/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.Scanner;
import java.util.Random;
        
public class JavaApplication19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();
        
        System.out.println("***********************");
        System.out.println(" Welcome to the Guessing Game ");
        System.out.println ( "*************************");
        int R ;
        R=obj.nextInt(10);
        int guess= 0;
        
     int Num= 0;
     while (Num!=R){
       System.out.println("Enter a number from 1 to 10 ");   
       Num = sc.nextInt();
       guess++;
       if(Num ==R){
           System.out.println(" You Won! The number was "+R);
       }
       else
       {System.out.println("try again");
     }
    }
        System.out.println(" it took you "+guess+" guesses to win");
        
    
}}
