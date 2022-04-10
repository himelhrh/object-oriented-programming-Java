
package labtask2a;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        
        System.out.println("Enter the following information: ");
        
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter Your Name: ");
        name=input.nextLine();
        System.out.println("My name is: "+name);
        
        int age ;
        System.out.print("Enter Your Age: ");
        age =input.nextInt();
        System.out.println("My age is: "+age);
        
        Double cgpa;
        System.out.print("Enter Your Cgpa: ");
        cgpa=input.nextDouble();
        System.out.println("My cgpa is: "+cgpa);
        
        input.nextLine();
        
        String department;
        System.out.print("Enter Your Department: ");
        department=input.nextLine();
        System.out.println("My Department is: "+department);
        
        String section;
        System.out.print("Enter Your Section Name: ");
        section =input.next();
        System.out.println("My section is: "+section);
        
       
    }
}
