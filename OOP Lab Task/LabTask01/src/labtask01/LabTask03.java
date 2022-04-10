package labtask01;

import java.util.Scanner;

public class LabTask03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();
        double area = 3.1416 * r * r;
        System.out.println("The area of circle is: " + area);
    }

}
