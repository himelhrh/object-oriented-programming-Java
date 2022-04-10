package lab_task_03_a;

import java.util.Scanner;

public class Mathclass_01 {

    public static void main(String[] args) {
        Scanner Rony = new Scanner(System.in);

        double number;

        System.out.print("Enter a double number: ");
        number = Rony.nextDouble();

        System.out.println("You have entered " + number + " as your input");

        double absolute = Math.abs(number);
        System.out.println("Absolute value of your entered value is: " + absolute);

        double floor = Math.floor(number);
        System.out.println("Floor value of your entered value is: " + floor);

        double ceil = Math.ceil(number);
        System.out.println("Ceil value of your entered value is: " + ceil);

        double round = Math.round(number);
        System.out.println("Round value of your entered value is: " + round);

        double sqrt = Math.sqrt(number);
        System.out.println("Square root value of your entered value is: " + sqrt);

    }
}
