package podzespoly;

import interfejsy_podzespolow.Disc;

public class DiscForLaptop implements Disc {

    String name = "Disc for Laptop";

    @Override
    public Disc getDisc() {
        System.out.println("Dodaję :" + name);
        return new DiscForLaptop();
    }
}
