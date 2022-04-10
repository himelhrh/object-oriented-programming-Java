package labsix;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Person's Name:" + name + " and Age:" + age);
    }

    public void update() {
        Scanner rony1 = new Scanner(System.in);
        name = rony1.next();
        age = rony1.nextInt();
    }

    public static void main(String[] args) {

        Scanner rony1 = new Scanner(System.in);
        System.out.println("How many persons you want to create: ");
        int r = rony1.nextInt();
        ArrayList<Person> rony = new ArrayList<Person>(r);
        for (int i = 0; i < r; i++) {
            System.out.println("Enter name and age for person: " + (i + 1));
            rony.add(new Person(rony1.next(), rony1.nextInt()));
        }
        for (int i = 0; i < r; i++) {
            rony.get(i).display();
        }

        System.out.println("Enter the index number of a person you want to search:");
        int r2 = rony1.nextInt();
        rony.get(r2).display();
        System.out.println("Enter the index number in which position you want to update:");
        int r3 = rony1.nextInt();
        System.out.println("Enter name and age for that new person:");
        rony.set(r3, rony.get(r3)).update();
        System.out.println("After Updating: ");
        for (int i = 0; i < r; i++) {
            rony.get(i).display();
        }
        System.out.println("Enter the index number from where you want to remove a person: ");
        int rony4 = rony1.nextInt();
        rony.remove(rony4);
        System.out.println("After Removing: ");
        for (int i = 0; i < rony.size(); i++) {
            rony.get(i).display();
        }
    }
}
