
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        int n, i, x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Elements in the array: ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element you want to search: ");
        x = in.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(x + " is found at index" + " " + i);
                break;
            }
        }
        if (i == n) {
            System.out.println("Element not found");
        }
    }
}
