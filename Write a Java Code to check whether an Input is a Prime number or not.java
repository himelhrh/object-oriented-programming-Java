
import java.util.Scanner;

public class Number4 {

    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("\nIt is a Prime Number.");
        } else {
            System.out.println("\nIt is not a Prime Number.");
        }
    }
}
