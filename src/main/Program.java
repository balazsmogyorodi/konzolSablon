package main;

import nezet.KonzolNezet;

public class Program {
    public static void main(String[] args) {
        KonzolNezet kn = new KonzolNezet();
        kn.kiirMindenkit();
        kn.kiirNyomtathatok();
        kn.rendezesBemutatasa();
        
        /* vagy KonzolNezet tartalmazza public feladatok():
        new KonzolNezet().feladatok();
        */
    }
}
