package podzespoly;

import interfejsy_podzespolow.Cooling;

public class CoolingForLaptop implements Cooling {

    String name = "Cooling for Laptop";

    @Override
    public Cooling getCooling() {
        System.out.println("Dodaję: " + name);
        return new CoolingForLaptop();
    }
}
