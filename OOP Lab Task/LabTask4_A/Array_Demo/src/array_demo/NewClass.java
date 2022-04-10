
package array_demo;


public class NewClass {
   public static void main(String[] args){
       int[] number;
       number= new int[5];
       //int[] number= new int[10];
       number[0]=1;
       number[1]=11;
       number[2]=21;
       number[3]=13;
       number[4]=1333;
       
       int len=number.length;
       System.out.println("Size of array: "+len);
       int sum= number[0]+number[1]+number[2]+number[3]+number[4];
       System.out.println("Sum of the array: "+sum);
       
       System.out.println(number[0]);
       
   } 
}
