package labtask01;

import java.util.Scanner;

public class LabTask01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your department: ");
        String department = scanner.nextLine();

        System.out.print("Enter the name of your favorite game: ");
        String favoriteGame = scanner.nextLine();

        System.out.println("\nMy name is " + name + ",\nMy student ID is: " + id + "\nMy address is: " + address + "\nMy department is: " + department + "\nMy favorite game is: " + favoriteGame + "\n");

    }
}
