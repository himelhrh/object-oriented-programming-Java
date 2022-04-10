package labtask4a;

import java.util.Scanner;

public class StringClass5 {

    public static void main(String[] args) {
        Scanner Rony = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = Rony.nextLine();

        System.out.print("Enter second string: ");
        String string2 = Rony.nextLine();

        System.out.println("You have entered as your first string: " + string1);
        System.out.println("You have entered as your second string: " + string2);

        System.out.println("Lower Case: ");
        System.out.println(string1.toLowerCase());
        System.out.println(string2.toLowerCase());
        
        System.out.println("Upper Case: ");
        System.out.println(string1.toUpperCase());
        System.out.println(string2.toUpperCase());
        
        
    }
}
