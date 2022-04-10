
import java.util.Scanner;
import java.lang.Math;

public class Math2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z, max, min;
        System.out.println("Enter three numbers : ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        max = Math.max(x, y);
        max = Math.max(max, z);
        min = Math.min(x, y);
        min = Math.min(min, z);
        System.out.println("The maximun number = " + max);
        System.out.println("The minimum number = " + min);
    }
}
