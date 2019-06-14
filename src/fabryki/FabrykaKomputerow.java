package fabryki;

import komputery.Komputer;
import komputery.KomputerPC;
import komputery.Laptop;

public class FabrykaKomputerow {

    public Komputer wydajKomputer(String model){
        Komputer komputer = zlozKomputer(model);
        komputer.instalowanieOprogramowania();
        komputer.pakowanie();
        komputer.sprzedawanie();
        return komputer;
    }

    protected Komputer zlozKomputer(String model) {
        Komputer komputer = null;
        if(model.equalsIgnoreCase("PC")) {
            komputer = new KomputerPC(new FabrykaPodzespolowPC());
        }
        else if (model.equalsIgnoreCase("Laptop")){
            komputer = new Laptop(new FabrykaPodzespolowLaptop());
        }
        return komputer;
    }

}
