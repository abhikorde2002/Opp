import Encapsulation.Intro;

public class Person {
    String name;
    int age;

    static int count;

    public Person() {
        count++;
        System.out.println("Its default constructor");
    }

    public Person(int age, String name) {
        this();
        this.name = name;
        this.age = age;
    }

     public void sleep() {
        System.out.println(name + " " + "is sleeping");
    }

     public void Run() {
        System.out.println(name + " " + "is Running");
    }

    public static void main(String[] args) {
        Intro intro = new Intro();
        intro.add();
    }
}
