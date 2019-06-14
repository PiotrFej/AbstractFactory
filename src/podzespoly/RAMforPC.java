package podzespoly;

import interfejsy_podzespolow.RAM;

public class RAMforPC implements RAM {

    String name = "RAM for PC";

    @Override
    public RAM getRam() {
        System.out.println("Dodaję: " + name);
        return new RAMforPC();
    }
}
