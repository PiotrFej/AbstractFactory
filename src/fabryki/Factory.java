package fabryki;

import komputery.Komputer;
import komputery.KomputerPC;

public class Factory {

    public static void main(String[] args) {

        FabrykaKomputerow fabrykaKomputerow = new FabrykaKomputerow();

        System.out.println("PC");
        Komputer pc = fabrykaKomputerow.wydajKomputer("PC");

        System.out.println();

        System.out.println("Laptop");

        Komputer laptop = fabrykaKomputerow.wydajKomputer("Laptop");
    }
}
