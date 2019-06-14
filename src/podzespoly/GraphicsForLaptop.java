package podzespoly;

import interfejsy_podzespolow.Graphic;

public class GraphicsForLaptop implements Graphic {

    String name = "Graphics for Laptop";

    @Override
    public Graphic getGraphic() {
        System.out.println("Dodaję: " + name);
        return new GraphicsForLaptop();
    }
}
