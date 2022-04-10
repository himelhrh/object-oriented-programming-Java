
import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {
        ArrayList<String> himel = new ArrayList<String>();
        himel.add("Himel");
        himel.add("Kashfea");
        himel.add("Naila");
        himel.add("Rakib");
        himel.add("Yeasin");
        himel.remove(4);
        himel.set(3,"Fimu");
        
        System.out.println(himel.get(2));
    }
}
