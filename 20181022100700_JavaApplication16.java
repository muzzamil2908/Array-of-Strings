/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random Obj = new Random();
        int n;
        int randomNumber;
        System.out.println(" How many lines ?");
        n = sc.nextInt();
        int i;

        for (i = 0; i < n; i++) {
            randomNumber = Obj.nextInt(10);

            for (int a = 0; a < 10; a++) {
                if (a == randomNumber) {
                    System.out.print("*");

                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
           
        }
        System.out.println( "end of program ");
    }
}

