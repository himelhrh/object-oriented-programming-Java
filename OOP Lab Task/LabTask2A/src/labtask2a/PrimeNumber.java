
package labtask2a;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
     
        System.out.println("Enter any positive integer number: ");
        int num= input.nextInt();
        int count= 0;
         for (int i=2; i<=num/2; i++){
             if(num%i==0){
                 count++;
                 break;
             }
         }
        if(count==0){
            System.out.println("Your Entered number is a prime number: ");
            
        }
        else {
            System.out.println("Your Entered number isn't a prime number: ");
        }
        
    }
    
}
