package magazyn;

import kategorie.Kategoria;
import kategorie.Podkategoria;

import java.util.ArrayList;

public class MenadzerTowarow {
    private final ArrayList<Towar> towar = new ArrayList<>();
    private final ArrayList<Kategoria> kategorie = new ArrayList<>();
    private final ArrayList<Podkategoria> podkategorie = new ArrayList<>();

    public MenadzerTowarow() {
        towar.add(new Towar(100, "Nike VaporMax"));
        towar.add(new Towar(250, "Nike AirForce 1"));
        towar.add(new Towar(80, "Dell Inspiron 15"));
        towar.add(new Towar(40, "HP Pavilion 15"));
        towar.add(new Towar(120, "Asus ROG Strix Scar III"));

        kategorie.add(new Kategoria("Odzież"));
        kategorie.get(0).getTowary().add(towar.get(0));
        kategorie.get(0).getTowary().add(towar.get(1));
        kategorie.add(new Kategoria("Elektronika"));
        kategorie.get(1).getTowary().add(towar.get(2));
        kategorie.get(1).getTowary().add(towar.get(3));
        kategorie.get(1).getTowary().add(towar.get(4));

        podkategorie.add(new Podkategoria("Buty"));
        podkategorie.get(0).getDziecko().add(new Podkategoria("Adidas"));
        podkategorie.get(0).getDziecko().add(new Podkategoria("Loro Piana"));
        podkategorie.get(0).getTowary().add(towar.get(0));
        podkategorie.get(0).getTowary().add(towar.get(1));

        podkategorie.add(new Podkategoria("Laptopy"));
        podkategorie.get(1).getDziecko().add(new Podkategoria("Gamingowe"));
        podkategorie.get(1).getDziecko().add(new Podkategoria("Biurowe"));
        podkategorie.get(1).getTowary().add(towar.get(2));
        podkategorie.get(1).getTowary().add(towar.get(3));
        podkategorie.get(1).getTowary().add(towar.get(4));
    }
    public void wypiszWszytskieKategorie() {
        wypiszKategorie();
        wypiszPodkategorie();
    }

    private void wypiszKategorie() {
        System.out.println("=====================================================");
        System.out.println("Kategorie:");
        for (Kategoria c : kategorie) {
            System.out.println(c.getNazwa());
            for (Towar m : c.getTowary()) {
                System.out.println(m.getNazwa() + ", cena jednostkowa: " + m.getCena());
            }
            System.out.println();
        }
    }

    private void wypiszPodkategorie() {
        System.out.println("=====================================================");
        System.out.println("Podkategorie: ");
        for (Podkategoria sc : podkategorie) {
            wypiszPodkategorieProduktu(sc);
        }
    }

    private void wypiszPodkategorieProduktu(Podkategoria podkategoria) {
        System.out.println(podkategoria.getNazwa());
        for (Towar m : podkategoria.getTowary()) {
            System.out.println(m.getNazwa() + ", cena jednostkowa: " + m.getCena());
        }
        System.out.println();
        for (Podkategoria sc : podkategoria.getDziecko()) {
            wypiszPodkategorieProduktu(sc);
        }
    }
}