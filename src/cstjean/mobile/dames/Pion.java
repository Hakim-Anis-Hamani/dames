package cstjean.mobile.dames;

public class Pion {

    private final String couleur;

    public Pion(String couleur) {
        this.couleur = couleur;
    }

    public Pion() {
        this.couleur = "Blanc";
    }

    public String getCouleur() {
        return couleur;
    }
}
