package podzespoly;

import interfejsy_podzespolow.Disc;

public class DiscForPC implements Disc {

    String name = "Disc for PC";

    @Override
    public Disc getDisc() {
        System.out.println("Dodaję: " + name);
        return new DiscForPC();
    }
}
