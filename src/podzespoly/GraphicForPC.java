package podzespoly;

import interfejsy_podzespolow.Graphic;

public class GraphicForPC implements Graphic {

    String name = "Graphics for PC";

    @Override
    public Graphic getGraphic() {
        System.out.println("Dodaję: " + name);
        return new GraphicForPC();
    }
}
