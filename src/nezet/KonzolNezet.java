package nezet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modell.KonkretOs;
import modell.MenthetoUtod;
import modell.NewRendezoComparator;
import modell.Nyomtathato;
import modell.NyomtathatoMenthetoUtod;
import modell.NyomtathatoUtod;
import modell.Rendezheto_utod;

public class KonzolNezet {

    private List<KonkretOs> mindenki;
    private List<Nyomtathato> nyomtathatoak;

    public KonzolNezet() {
        mindenki = new ArrayList<>();
        nyomtathatoak = new ArrayList<>();

        feltoltMindenki();
        feltoltNyomtathato();
        kivetelkezeles();
    }

    private void feltoltMindenki() {
        KonkretOs ko1 = new KonkretOs();
        mindenki.add(ko1);
        mindenki.add(new KonkretOs(true));

        mindenki.add(new MenthetoUtod("Menthető-1"));
        mindenki.add(new MenthetoUtod("Menthető-2", true));

        mindenki.add(new NyomtathatoUtod());
        mindenki.add(new NyomtathatoUtod());

        mindenki.add(new NyomtathatoMenthetoUtod());
        mindenki.add(new NyomtathatoMenthetoUtod());
    }

    private void feltoltNyomtathato() {
        for (KonkretOs ko : mindenki) {
            if (ko instanceof Nyomtathato) {
                nyomtathatoak.add((Nyomtathato) ko);
            }
        }
    }

    public void kiirMindenkit() {
        for (KonkretOs os : mindenki) {
            System.out.println(os);
        }
    }

    public void kiirNyomtathatok() {
        for (Nyomtathato ny : nyomtathatoak) {
            System.out.println(((KonkretOs) ny).mitTud());
        }
    }

    public void kivetelkezeles() {
        try {
            KonkretOs k0 = new KonkretOs();
            KonkretOs k1 = new KonkretOs(false);
            //      KonkretOs k2 = new KonkretOs(false, "1");
            System.out.println(k0.toString());
            System.out.println(k1.toString());

        } catch (Exception e) {
            System.err.println("Csak akkor van kivétel, ha rossz az info!");
            System.err.println("k3 db kivétel:");
            System.err.println(e.getMessage());
        }

    }

    public void rendezesBemutatasa() {
        Rendezheto_utod r0 = new Rendezheto_utod(2, "Pál");
        Rendezheto_utod r1 = new Rendezheto_utod(6, "Pisti");
        Rendezheto_utod r2 = new Rendezheto_utod(1, "Milán");
        Rendezheto_utod r3 = new Rendezheto_utod(7, "Jakab");
        Rendezheto_utod r4 = new Rendezheto_utod(3, "Bence");

        List<Rendezheto_utod> utodok = new ArrayList<>();
        utodok.add(r0);
        utodok.add(r1);
        utodok.add(r2);
        utodok.add(r3);
        utodok.add(r4);
        rendezesKorszerint(utodok);
        listaKiirasa("Nevek kor sorrendbe:", utodok);
        rendezesNevSzerint(utodok);
        listaKiirasa("Nevek kor sorrendbe:", utodok);

    }

    private void rendezesKorszerint(List<Rendezheto_utod> utodok) {
        Collections.sort(utodok);
    }

    private void rendezesNevSzerint(List<Rendezheto_utod> utodok) {
        utodok.sort(new NewRendezoComparator());
    }

    private void listaKiirasa(String cim, List<Rendezheto_utod> utodok) {
        System.out.println(cim);
        for (Rendezheto_utod u : utodok) {
            System.out.println(u.toString());

        }

    }

}
