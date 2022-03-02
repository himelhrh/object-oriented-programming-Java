//Define a method called max().
//This method takes two parameters num1 and num2 and returns the maximum between the two.

public class Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = max(a,b);
        System.out.println("Maximum Value: "+c);
    }
    public static int max(int n1,int n2){
        int max_Value;
        if(n1>n2)
            max_Value = n1;
        else
            max_Value = n2;
        return max_Value;
    }
}
