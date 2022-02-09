package Abstract;

 class Abstract1{
     public static void main(String[] args) {
         Audi audi = new Audi();
         audi.start();
         audi.price=30000000;
         audi.ghare=6;
     }
}
abstract class Car {
    int price;
    int ghare;
   abstract void start();

   void average(){
       System.out.println("Its Good");
   }
}

class Audi extends Car{
    @Override
    void start() {
        System.out.println("Audi Starting");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("BMW is Starting");
    }
}
