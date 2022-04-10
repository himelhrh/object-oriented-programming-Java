import java.util.Scanner;
public class Number7 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 char z;
 System.out.println("Enter any character: ");
 z = sc.next().charAt(0);
 if((z >= 'a' && z <= 'z') || (z >= 'A' && z <= 'z'))
 {
 if(z=='a' || z=='e' || z=='i' || z=='o' || z=='u' ||
 z=='A' || z=='E' || z=='I' || z=='O' || z=='U')
 System.out.println(z +" is a Alphabet and " + z + " is a Vowel");
 else
 System.out.println(z + " is a Alphabet and " + z + " is a consonant");
 }
 else if(z >= '0' && z <= '9')
 System.out.println(z + " is a digit.");
 else
 System.out.println(z + " is a special character.");
 }
}
