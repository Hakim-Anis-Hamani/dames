package cstjean.mobile.dames;

/**
 * Information pour l'objet Damier.
 *
 * @author Hakim-Anis Hamani
 */
public class Pion {
    /**Couleur du pion.*/
    private final String couleur;

    /**
     * Constructeur.
     *
     * @param couleur du pion créé
     */
    public Pion(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Constructeur défault pour un pion.
     */
    public Pion() {
        this.couleur = "Blanc";
    }

    /**
     * Méthode permettant de donner la couleur d'un pion.
     *
     * @return couleur du pion
     */
    public String getCouleur() {
        return couleur;
    }
}
