package fabryki;

import interfejsy_podzespolow.Cooling;
import interfejsy_podzespolow.Disc;
import interfejsy_podzespolow.Graphic;
import interfejsy_podzespolow.RAM;
import podzespoly.DiscForPC;
import podzespoly.GraphicForPC;
import podzespoly.RAMforPC;

public class FabrykaPodzespolowPC implements FabrykaPodzespolowKomputerowych {
    @Override
    public Disc makeDisc() {
        return new DiscForPC();
    }

    @Override
    public Graphic makeGraphic() {
        return new GraphicForPC();
    }

    @Override
    public RAM makeRAM() {
        return new RAMforPC();
    }

    @Override
    public Cooling makeCooling() {
        return null;
    }
}
