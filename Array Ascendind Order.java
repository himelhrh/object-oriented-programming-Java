
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        int n, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println(arr[size - 1]);
    }
}
