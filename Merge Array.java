
import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        int s1, s2, i, j = 0;
        int arr1[], arr2[], merge[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        s1 = scanner.nextInt();
        System.out.print("Enter the size of the second array : ");
        s2 = scanner.nextInt();
        arr1 = new int[s1];
        arr2 = new int[s2];
        merge = new int[s1 + s2];
        System.out.println("Enter elements for the first array :");
        for (i = 0; i < s1; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements for the second array :");
        for (i = 0; i < s2; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr2[i] = scanner.nextInt();
        }
        for (i = 0; i < s1; i++, j++) {
            merge[j] = arr1[i];
        }
        for (i = 0; i < s2; i++, j++) {
            merge[j] = arr2[i];
        }
        System.out.println("\nThe merged array is: ");
        for (i = 0; i < (s1 + s2); i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
