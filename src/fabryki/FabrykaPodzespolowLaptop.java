package fabryki;

import interfejsy_podzespolow.Cooling;
import interfejsy_podzespolow.Disc;
import interfejsy_podzespolow.Graphic;
import interfejsy_podzespolow.RAM;
import podzespoly.*;

public class FabrykaPodzespolowLaptop implements FabrykaPodzespolowKomputerowych {
    @Override
    public Disc makeDisc() {
        return new DiscForLaptop();
    }

    @Override
    public Graphic makeGraphic() {
        return new GraphicsForLaptop();
    }

    @Override
    public RAM makeRAM() {
        return new RAMforLaptop();
    }

    @Override
    public Cooling makeCooling() {
        return new CoolingForLaptop();
    }
}
