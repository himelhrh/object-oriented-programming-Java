import org.w3c.dom.html.HTMLImageElement;

public class Student {
    private String id;
    private String name;
    private double Cgpa;
    public void insert_Record(String id, String name,double Cgpa){
        this.id = id;
        this.name = name;
        this.Cgpa = Cgpa;
    }
    public void display_Record(){
        System.out.println("ID is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Cgpa is: "+Cgpa);

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insert_Record("211-15-14616", "Himel", 3.70);
        s1.display_Record();
        Student s2 = new Student();
        s2.insert_Record("211-15-14578", "Kashfea", 3.71);
        s2.display_Record();
    }
}
