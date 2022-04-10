package labtask7;

public class Volvo extends Vehicle implements Drive {

    private double price;

    public Volvo(double price, String r) {
        super(r);
        this.price = price;
     
    }
    
    public void startEngine() {
        System.out.println("Start the engine.");
    };

    public void stopEngine() {
        System.out.println("Stop the engine.");
    };
    public void move() {
        System.out.println("Move! Move! Move!");
    };
    
     public static void main(String[] args) {
         Volvo v1=new Volvo (333333, "Volvo");
         v1.move();
         v1.controlSpeed();
         v1.startEngine();
         v1.stopEngine();
         

    }

}
