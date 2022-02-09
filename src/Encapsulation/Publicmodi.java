package Encapsulation;
//With Public modifier we can access any think like variable, constructor , methods.
public class Publicmodi {
   public int add ;
   public String name;

    public Publicmodi(int add, String name) {
        this.add = add;
        this.name = name;
    }
}
class Public extends Publicmodi {
    public static void main(String[] args) {
        Public public1 = new Public(2,"Abhishek");
        System.out.println(public1.add+" "+public1.name);
    }
    public Public(int add, String name) {
        super(add, name);
    }
}
