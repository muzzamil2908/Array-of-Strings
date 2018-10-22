package javaapplication17;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();
        int elemCount;
        int RandomNumbers;
        int i = 0;
        int flag = 0;
        System.out.println("How many elements");
        elemCount = sc.nextInt();
        int[] array = new int[elemCount];
        for (int j = 0; j < elemCount; j++) {
            array[j] = obj.nextInt(1000);
            System.out.println(array[j]);
        }
        System.out.println("which number to search : ");
        int a = sc.nextInt();
        for (int j = 0; j < elemCount; j++) {
            if (array[j] == a) {
                i = j;
                flag = -1;
            }
        }
        if (flag == -1) {
            System.out.println("element found at index " + i);
        } else {
            System.out.println("nmbr not found");
        }
    }
}
