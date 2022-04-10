
package labtask7.numberTwo;

public class MyClass  {
     public static void main(String[] args){
         CDPlayer cd1= new CDPlayer();
         cd1.setName("Rony CD");
           System.out.println("Player name: "+cd1.getName());
         cd1.play();
         cd1.stop();
         cd1.pause();
         cd1.reverse();
         cd1.audio();
         DVDPlayer dd1= new DVDPlayer();
         dd1.setName("Rony DVD");
         System.out.println("Player name: "+dd1.getName());
         dd1.play();
         dd1.stop();
         dd1.pause();
         dd1.reverse();
         dd1.video();
     }
}
