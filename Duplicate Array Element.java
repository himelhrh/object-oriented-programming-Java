import java.util.Scanner;
public class Number4 {  
    public static void main(String[] args) {      
          Scanner sc = new Scanner(System.in);
           
          System.out.println("Enter the Array Size:");
          
          int size = sc.nextInt();
          int [] arr = new int [size];
          System.out.println("Enter Array Input:");
          for(int i=0; i<size; i++){
              arr[i] = sc.nextInt();
          }
          
        System.out.println("Duplicate elements in given array: ");  
         
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  