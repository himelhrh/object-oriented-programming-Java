
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        n = in.nextInt();
        float arr[] = new float[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter CGPA of student " + (i + 1) + ": ");
            arr[i] = in.nextFloat();
        }
        float smallest = arr[0];
        float largest = arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largeest CGPA = " + largest);
        System.out.println("Smallest CGPA = " + smallest);
    }
}
