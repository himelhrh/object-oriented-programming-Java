
package javaapplication30;
import java.util.Scanner;
import javaapplication30.RonyLaptop;
public class RonyLaptopMyClass {
    public static void main(String[] args){
        Scanner rony= new Scanner(System.in);
        String modelName = rony.nextLine();
        int code = rony.nextInt();
        String brand = rony.nextLine();
        double price = rony.nextDouble();
        
        System.out.println("Set the details for laptop 1:  ");
        RonyLaptop myLaptop1 = new RonyLaptop(modelName, code,  brand, price);
        
        System.out.println("Set the details for laptop 2:  ");
        RonyLaptop myLaptop2 = new RonyLaptop(modelName, code,  brand, price);
        
        System.out.println("Set the details for laptop 3:  ");
        RonyLaptop myLaptop3 = new RonyLaptop(modelName, code,  brand, price);
        
        
        
    }
}
