
import java.util.Scanner;

public class Number4 {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the marks of 3 subjects (out of 100)");

            System.out.println("Enter the marks of subject 1:");

            int sub1 = sc.nextInt();

            System.out.println("Enter the marks of subject 2:");

            int sub2 = sc.nextInt();
            System.out.println("Enter the marks of subject 3:");
            
            int sub3 = sc.nextInt();

            

// Total
                int total = sub1 + sub2 + sub3;

                System.out.println("Total = " + total);

// Percentage
                float percent = (float) total / 300 * 100;

                System.out.println("Percentage = " + percent);

// Highest Marks
                if (sub1 > sub2 && sub1 > sub3) {

                    System.out.println("Highest marks scored is " + sub1);

                } 
                else if (sub2 > sub1 && sub2 > sub3) {

                    System.out.println("Highest marks scored is " + sub2);

                }
                else
                    System.out.println("Highest marks scored is "+ sub3);

// Lowest Marks
            if (sub1 < sub2 && sub1 < sub3) {

                    System.out.println("Lowest marks scored is " + sub1);

                } 
                else if (sub2 < sub1 && sub2 < sub3) {

                    System.out.println("Lowest marks scored is " + sub2);

                }
                else
                    System.out.println("Lowest marks scored is "+ sub3);
// Average
                float avg = (float) total / 2;

                System.out.println("Average is " + avg);

            
        }

    }

}
