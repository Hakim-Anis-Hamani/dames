package cstjean.mobile.dames;

import java.util.LinkedList;
import java.util.List;

public class Damier {
    private final List<Pion> damier = new LinkedList<>();
    private int nombrePion = 0;

    public void initialiseDamier() {
        for (int i = 0; i < 50; i++) {
            damier.add(null);
        }
    }

    public void ajouterPion(int position,Pion pion) {
        damier.set(position, pion);
        nombrePion++;
    }

    public Pion getPion(int position) {
        return damier.get(position);
    }

    public int getNombrePions() {
        return nombrePion;
    }
}
