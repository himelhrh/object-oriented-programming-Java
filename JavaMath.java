import java.lang.Math;
public class JavaMath {
    public static void main(String[] args) {
        int x = 150;
        int y = -120;
        int z = 100;
        double a = 10.5;
        System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
        System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
        System.out.println("Math.ceil(" + a + ")=" +Math.ceil(x));
        System.out.println("Math.abs(-0)=" + Math.abs(-0));
        System.out.println("Math.max(" + x + "," + z + ")=" + Math.max(x, y));
        System.out.println("Math.sqrt(" + x + ")=" + Math.sqrt(x));
    }
}
