package labtask4a;

import java.util.Scanner;

public class MethodProblem02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodProblem02 rony = new MethodProblem02();
        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();
        double area = rony.area(r);
        System.out.println("Area of the circle is: "+area);
        

    }
    public double area(double r){
        return Math.PI*r*r;
    }
}
