package Encapsulation;

public class Encap {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setPrice(233);
        System.out.println(l.getPrice());
//        Laptop laptop = new Laptop(8,"hp",50000,11);
//        System.out.println(laptop.getRam()+" "+laptop.getName()+" "+ laptop.getPrice()+" "+ laptop.getVersion());
    }

}
class Laptop {
    private int ram;
    private String name;
    private int price;
    private int version;

//    Laptop(int ram ,String name,int price,int version){
//        this.ram = ram;
//        this.name=name;
//        this.price=price;
//        this.version=version;
//    }

    public void setRam(int ram){
        this.ram=ram;
    }
    public int getRam(){
        return ram;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int price){
        boolean isAdmin= true;
        if (!isAdmin){
            System.out.println("You don't have any authority to chang price");
        }
        else {
            this.price=333;
        }

    }
    public int getPrice(){
        return price;
    }

    public void setVersion(int version){
        this.version=version;
    }
    public int getVersion(){
        return version;
    }
}
