package podzespoly;

import interfejsy_podzespolow.RAM;

public class RAMforLaptop implements RAM {

    String name = "RAM for Laptop";

    @Override
    public RAM getRam() {
        System.out.println("Dodaję: " + name);
        return new RAMforLaptop();
    }
}
