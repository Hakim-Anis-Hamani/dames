package cstjean.mobile.dames;

/**
 * Information pour l'objet Dame.
 *
 * @author Hakim-Anis Hamani
 */

public class Dame extends Pion {
    /**
     * Constructeur.
     *
     * @param couleur de la dame
     */
    public Dame(Couleur couleur) {
        super(couleur);
    }

    /**
     * Constructeur
     * Constructeur de base sans paramètre retournant une dame blanche.
     */
    public Dame() {
        super(Couleur.Blanc);
    }

    /**
     * Override.
     * Modification de la méthode get représentation pour obtenir la bonne lettre.
     */
    @Override
    public String getRepresentation() {
        if (this.getCouleur() == Couleur.Noir) {
            return "D";
        } else {
            return "d";
        }
    }
}
