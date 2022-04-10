public class Loop2 {
 public static void main(String[] args) {
 int i ;
 for(i= 1; i<= 100; i++)
 {
 if(i%3 == 0 && i%6 ==0)
 {
 if(i != 30 && i != 60 && i != 90)
 System.out.println(i + ",");
 }
 }
 }
}