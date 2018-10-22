
import java.util.Random;
import java.util.Scanner;


public class random {
    public static void main(String[]args){
        Scanner Keyboard= new Scanner(System.in); 
        int n;
        System.out.println("How many numbers?");
        n=Keyboard.nextInt();    
    for(int i=0;i<n;i++){
       Random obj=new Random();
        int a= obj.nextInt(1000); 
       
    
     if(a%2==0){
               System.out.println(a + " is even");
           }
           else{
                 System.out.println(a + " is odd");
           }
             
    }
    
}
}