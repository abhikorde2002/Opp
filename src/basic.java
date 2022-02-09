
public class basic {

    public static void main(String[] args) {
        Person person =new Person();
        person.name="Abhi";
        person.age=54;
        System.out.println(person.age+" "+person.name);

        Person p1 = new Person();
        p1.name = "Akshay";
        p1.age =30;

        person.sleep();
        p1.Run();

        System.out.println(Person.count);

        Person person1 = new Person(2,"Ajit");
        System.out.println(person1.age+" "+person1.name);
    }

}
