package lab_task_03_a;

import java.util.Scanner;
        
public class MathClass_02 {

    public static void main(String[] args) {
        Scanner Rony = new Scanner(System.in);

        double number1, number2, number3;

        System.out.print("Enter First double number: ");
        number1 = Rony.nextDouble();

        System.out.print("Enter Second double number: ");
        number2 = Rony.nextDouble();

        System.out.print("Enter Third double number: ");
        number3 = Rony.nextDouble();

        System.out.println("You have entered " + number1 + " as your First input");
        System.out.println("You have entered " + number2 + " as your Second input");
        System.out.println("You have entered " + number3 + " as your Third input");

        double max = Math.max(Math.max(number1, number2), number3);
        System.out.println("The maximum value from your entered value is: " + max);

        double min = Math.min(Math.min(number1, number2), number3);
        System.out.println("The minimum value from your entered value is: " + min);
    }
}
