package labtask2a;

import java.util.Scanner;

public class MaximumVlue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        System.out.print("Enter first Number :");
        A = input.nextInt();
        System.out.print("Enter second Number:");
        B = input.nextInt();
        System.out.print("Enter third Number :");
        C = input.nextInt();

        if (A > B && A > C) {
            System.out.println("Maximum value is: " + A);
        } else if (B > C && B > A) {
            System.out.println("Maximum value is: " + B);
        } else {
            System.out.println("Maximum value is: " + C);
        }
    }

}
