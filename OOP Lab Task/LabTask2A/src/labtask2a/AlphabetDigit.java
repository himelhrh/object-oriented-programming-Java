package labtask2a;
import java.util.Scanner;
public class AlphabetDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char r;
        System.out.println("Enter any caracter : ");
        r = in.next().charAt(0);
        if ((r >= 'a' && r<= 'z') || (r >= 'A' && r <= 'Z')) {
            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u'
                    || r == 'A' || r == 'E' || r == 'I' || r == 'O' || r == 'U') {
                System.out.println(r + " is a Alphabet and " + r + " is a Vowel");
            } else {
                System.out.println(r + " is a Alphabet and " + r + " is a consonant");
            }
        } else if (r >= '0' && r <= '9') {
            System.out.println(r + " is a digit.");
        } else {
            System.out.println(r + " is a special character.");
        }
    }

}
