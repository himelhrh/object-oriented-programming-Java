
package labtask7.numberTwo;


public class DVDPlayer {
   private String name;
   public void setName(String b){
         this.name=b;
         System.out.println("name"+b);
       
   }
    public String getName(){
         return this.name;
     }
    public void play(){
        System.out.println("Play! Play! Play!.");
    };

    public void stop(){
        System.out.println("Stop!stop! .");
    };

    public void pause(){
        System.out.println("Pause");
    };

    public void reverse(){
        System.out.println("Reverse");
    };
    public void video(){
        System.out.println("Video!");
    }; 
}
