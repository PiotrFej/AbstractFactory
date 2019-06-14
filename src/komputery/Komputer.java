package komputery;

import interfejsy_podzespolow.Cooling;
import interfejsy_podzespolow.Disc;
import interfejsy_podzespolow.Graphic;
import interfejsy_podzespolow.RAM;

public abstract class Komputer {

    Disc disc;
    Graphic graphic;
    RAM ram;
    Cooling cooling;

    public abstract void skladanie();

    public void instalowanieOprogramowania(){
        System.out.println("Instaluję oprogramowanie.....");
    }

    public void pakowanie(){
        System.out.println("Pakuje sprzet...");
    }

    public void sprzedawanie(){
        System.out.println("Sprzedaje sprzet...");
    }


}
