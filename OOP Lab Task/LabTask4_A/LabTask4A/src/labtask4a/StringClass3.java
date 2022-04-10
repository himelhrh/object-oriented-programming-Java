package labtask4a;

import java.util.Scanner;

public class StringClass3 {
    public static void main(String[] args){
        Scanner Rony = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String string1 =Rony.nextLine();
        
        System.out.print("Enter second string: ");
        String string2 =Rony.nextLine();
        
        System.out.print("Enter third string: ");
        String string3 =Rony.nextLine();
        
        System.out.println("You have entered as your first string: "+string1);
        System.out.println("You have entered as your second string: "+string2);
        System.out.println("You have entered as your third string: "+string3);
        int flag=0;
        while(string1.equals(string2)){
            flag++;
        System.out.println("String 1 is Equals to String2");
        break;
        }
        while(string1.equals(string3)){
            flag++;
        System.out.println("String 1 is Equals to String3");
        break;
        }
        while(string2.equals(string3)){
            flag++;
        System.out.println("String 2 is Equals to String3");
        break;
        }
        
        if(flag==0){
            System.out.println("No strings you entered are equal");
        }
        

    }
}
