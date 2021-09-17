package cstjean.mobile.dames;

/**
 * Information pour l'objet Damier.
 *
 * @author Hakim-Anis Hamani
 */
public class Pion {
    /**Couleur du pion.*/
    private final Couleur couleur;

    /**
     * Constructeur.
     *
     * @param couleur du pion créé
     */
    public Pion(Couleur couleur) {
        this.couleur = couleur;
    }

    /**
     * Constructeur défault pour un pion.
     */
    public Pion() {
        this.couleur = Couleur.Blanc;
    }

    /**
     * Méthode permettant de donner la couleur d'un pion.
     *
     * @return couleur du pion
     */
    public Couleur getCouleur() {
        return couleur;
    }

    public Boolean estNoir() {
        if (this.couleur == Couleur.Noir) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getRepresentation() {
        return couleur.representaionGraphique;
    }

    /**
     * Énumération qui détien les couleurs possibles.
     *
     *
     */
    public enum Couleur {
        Blanc("p"),
        Noir("P");

        private final String representaionGraphique;

        private Couleur(String representaionGraphique) {
            this.representaionGraphique = representaionGraphique;
        }
    }

}
