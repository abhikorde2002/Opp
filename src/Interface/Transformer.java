package Interface;

public class Transformer implements Car,Person {
    public static void main(String[] args) {
        Transformer transformer = new Transformer();
        transformer.price();
        transformer.Run();

    }

    @Override
    public void price() {
        System.out.println("My Car name is Lamborgine and Price is 4.5 crode");
    }

    @Override
    public void Run() {
        System.out.println("Daly i wake 3 kilo meter");
    }
}
 interface Car{

     void price();

 }
 interface Person{

    void Run();
 }
