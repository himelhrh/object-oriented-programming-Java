public class MethodOverloading {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading himel = new MethodOverloading();
        himel.sum(10,20);
        himel.sum(10,20,30);
    }
}
