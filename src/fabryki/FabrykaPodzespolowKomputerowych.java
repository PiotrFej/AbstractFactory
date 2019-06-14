package fabryki;

import interfejsy_podzespolow.Cooling;
import interfejsy_podzespolow.Disc;
import interfejsy_podzespolow.Graphic;
import interfejsy_podzespolow.RAM;

public interface FabrykaPodzespolowKomputerowych {

    public Disc makeDisc();
    public Graphic makeGraphic();
    public RAM makeRAM();
    public Cooling makeCooling();
}
