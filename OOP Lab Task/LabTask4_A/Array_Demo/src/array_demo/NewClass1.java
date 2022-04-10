package array_demo;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {
        Scanner Rony = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of array: ");
        n = Rony.nextInt();

        double[] rony = new double[n];
        System.out.print("Enter any " + n + " double numbers as array input: ");
        for (int i = 0; i < n; i++) {
            rony[i] = Rony.nextDouble();
        }
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + rony[i];
        }
        double avg = sum / n;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
        
        
        double max= rony[0];
        for(int i=1; i<n; i++){
            if(max<rony[i]){
                max= rony[i];
            }
          
        }
        System.out.println("max is: " + max);
        
        double min= rony[0];
        for(int i=1; i<n; i++){
            if(min>rony[i]){
                max= rony[i];
            }
  
          
        }
        
         System.out.println("minimum is: " + min);
        
        
        
        
        
        
        
        
        
        
        
    }
}
