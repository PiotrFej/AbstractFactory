package komputery;

import fabryki.FabrykaPodzespolowLaptop;

public class Laptop extends Komputer {

    FabrykaPodzespolowLaptop fabrykaPodzespolowLaptop;

    public Laptop (FabrykaPodzespolowLaptop f){
        fabrykaPodzespolowLaptop = f;
        skladanie();
    }

    @Override
    public void skladanie() {
        disc = fabrykaPodzespolowLaptop.makeDisc().getDisc();
        ram = fabrykaPodzespolowLaptop.makeRAM().getRam();
        graphic = fabrykaPodzespolowLaptop.makeGraphic().getGraphic();
        cooling = fabrykaPodzespolowLaptop.makeCooling().getCooling();

    }
}
