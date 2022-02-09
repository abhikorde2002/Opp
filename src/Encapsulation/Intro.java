package Encapsulation;

public class Intro extends Protectedmodi{
    public Intro(int ak, String name) {
        super(ak, name);
    }

    public Intro() {
        super();
    }

    public static void main(String[] args) {
       Intro intro = new Intro(2,"Sarina");

        System.out.println(intro.Ak+" "+intro.name);
    }
     public void add(){
       System.out.println("I am at Satara");
   }

}
