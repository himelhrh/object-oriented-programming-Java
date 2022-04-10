
package labtask7;

public abstract class Vehicle {
    protected String model;
    public Vehicle(String r){
         this.model = r;
        System.out.println("Vehicle name:"+r);
    }
    public abstract void move();
        
    
    public void controlSpeed(){
         System.out.println("Speed Control! Speed Control!");
    };




}
