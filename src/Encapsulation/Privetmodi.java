package Encapsulation;
//With the help of privet access specifier no one can access variable.
public class Privetmodi {
   private int v1 = 20;
   private String name= "Amit";

   public int getV1() {
      return v1;
   }

   public void setV1(int v1) {
      this.v1 = v1;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

//   public Privetmodi(int v1, String name) {
//      this.v1 = v1;
//      this.name = name;
//   }

   public static void main(String[] args) {
      Privetmodi p1 = new Privetmodi();
      p1.name="Qspider";
      p1.v1=22;
      System.out.println(p1.getName()+" "+p1.getV1());
   }
}

class Pri extends Privetmodi{
   public static void main(String[] args) {
      Pri p = new Pri();
      System.out.println(p.getName()+" "+p.getV1());
   }

//   public Pri(int v1, String name) {
//      super(v1, name);
//   }
}
