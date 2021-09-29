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

    /**
     * Méthode donnant un réponse boolean si le pion est de couleur noir.
     *
     * @return True ou False
     */
    public Boolean estNoir() {

        return this.couleur == Couleur.Noir;
    }

    /**
     * Méthode donnant un réponse boolean si le pion est de couleur noir.
     *
     * @return représentation graphique de la couleur du pion
     */
    public String getRepresentation() {
        return couleur.representaionGraphique;
    }

    /**
     * Couleurs pouvant être attribuer à un pion.
     */
    public enum Couleur {
        /** Couleur Blanche.*/
        Blanc("p"),

        /** Couleur Noire.*/
        Noir("P");

        /** Representaion graphique du pion.*/
        private final String representaionGraphique;

        Couleur(String representaionGraphique) {
            this.representaionGraphique = representaionGraphique;
        }
    }

}
