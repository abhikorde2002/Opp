package Inharitance;

import Encapsulation.Protectedmodi;

public class Protected extends Protectedmodi {
    public Protected(int ak, String name) {
        super(ak, name);
    }

    public static void main(String[] args) {
        Protected p = new Protected(1,"Rutuja");
        System.out.println(p.Ak+" "+p.name);
    }
}
