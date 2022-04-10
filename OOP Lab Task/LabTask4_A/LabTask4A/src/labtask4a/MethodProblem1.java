package labtask4a;

import java.util.Scanner;

public class MethodProblem1 {

    public static void main(String[] args) {
        Scanner Rony = new Scanner(System.in);

      System.out.print("Enter the 1st number: ");
      double a =     Rony.nextDouble();
      
      System.out.print("Enter the 2nd number: ");
      double b = Rony.nextDouble();
      
      System.out.println("\n\n \t\t\t ********************** Main Menu **********************");

 

    System.out.printf("\n\n \t\t\t Choose a category to play: ");
    System.out.printf("\n \t\t\t 1. Addition\n");
    System.out.printf(" \t\t\t 2. Substraction\n: ");
    System.out.printf(" \t\t\t 3. Multiplication\n");
    System.out.printf(" \t\t\t 4. Division\n");

    System.out.printf("\n \t\t\t *******************************************************************\n");
    System.out.printf(" \t\t\t Enter your choice: ");
    int n = Rony.nextInt();
    
    MethodProblem1 obj=new MethodProblem1();
    
    if(n == 1)
    {
       System.out.println(a +"+"+ b + " = " + obj.sum(a, b)); 
    }
    else if(n == 2)
    {
        System.out.println(a +"-"+ b + " = " + obj.sub(a, b))
    }
    else if(n == 3)
    {
        System.out.println(a +"*"+ b + " = " + obj.mul(a, b))
    }
    if(n == 4)
    {
        System.out.println(a +"/"+ b + " = " + obj.div(a, b))
    }
      
      
      //System.out.print("Operation (+,-,*,/): ");
      //char k = scanner.next().charAt(0);
      
      
      
      if(n == 1) {
        System.out.println(a + "+" + b + " = " + obj.sum(a, b));
      }else if(n == 2) {
        System.out.println(a + "-" + b + " = " + obj.sub(a, b));
      }else if(n == 3) {
        System.out.println(a + "*" + b + " = " + obj.mul(a, b));
      }else if(n == 4) {
        System.out.println(a + "/" + b + " = " + obj.div(a, b));
      }else {
        System.out.println("Enter a valid input!");
      }
      
      System.out.print("Press 'y' to try again:\n");
      System.out.print("Press 'q' to quit:\n");
      char n = scanner.next().charAt(0);
      
      if (n == 'q') {
                break;
      }else if(n == 'y'){
        continue;
      }
    }
    
    scanner.close();

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
    }

}
