package labtask4a;

import java.util.Scanner;

public class MethodProblem01 {

    public static void main(String[] args) {
        Scanner Rony = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        double a = Rony.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double b = Rony.nextDouble();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int n = Rony.nextInt();

        MethodProblem01 rony = new MethodProblem01();
    if(n==1){
        System.out.println(a + "+" + b + "=" + rony.sum(a, b));
    }
    if(n==2){
        System.out.println(a + "-" + b + "=" + rony.sub(a, b));
    }
    if(n==3){
        System.out.println(a + "*" + b + "=" + rony.mul(a, b));
    }
    if(n==4){
        System.out.println(a + "/" + b + "=" + rony.div(a, b));
    }




    }
    

    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

}
