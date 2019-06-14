package komputery;

import fabryki.FabrykaPodzespolowPC;

public class KomputerPC extends Komputer {

    // FabrykaPodzespolowKomputerowych fabrykaPodzespolowKomputerowych;
    FabrykaPodzespolowPC fabrykaPodzespolowPC;

/*    public KomputerPC (FabrykaPodzespolowPC fabrykaPodzespolowPC){        //DLACZEGO TO NIE DZIAŁA (NullPointerException)
        skladanie();
    }*/

public KomputerPC (FabrykaPodzespolowPC f){                                 //A TO DZIAŁA??
    fabrykaPodzespolowPC = f;
    skladanie();
    }

    @Override
    public void skladanie() {
        disc = fabrykaPodzespolowPC.makeDisc().getDisc();
        graphic = fabrykaPodzespolowPC.makeGraphic().getGraphic();
        ram = fabrykaPodzespolowPC.makeRAM().getRam();

    }
}
