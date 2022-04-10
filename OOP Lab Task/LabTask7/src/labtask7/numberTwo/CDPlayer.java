
package labtask7.numberTwo;

public class CDPlayer {
    private String name;
     public void setName(String a){
         this.name=a;
         System.out.println("name"+a);
       
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
    public void audio(){
        System.out.println("Audio!");
    };
}
