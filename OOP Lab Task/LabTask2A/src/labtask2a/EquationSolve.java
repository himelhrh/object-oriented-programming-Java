package labtask2a;

import java.util.Scanner;

public class EquationSolve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Enter Four integer Number:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        int solution1 = (A * B - C * D);
        int solution2 = 2 * A - B + 3 * D;
        int solution3 = (A * A) + (B * B) - (C * C) + (D * D);
        int solution4 = (A * A * A) + B - (C * C);

        System.out.println("Solution of Equation - 1=" + solution1);
        System.out.println("Solution of Equation - 2=" + solution2);
        System.out.println("Solution of Equation - 3=" + solution3);
        System.out.println("Solution of Equation - 4=" + solution4);

    }

}
