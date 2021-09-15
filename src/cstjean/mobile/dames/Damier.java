package cstjean.mobile.dames;

import java.util.LinkedList;
import java.util.List;

/**
 * Information pour l'objet Damier.
 *
 * @author Hakim-Anis Hamani
 */
public class Damier {

    /**Positions du damier.*/
    private final List<Pion> damier = new LinkedList<>();

    /** Nombre de pion sur le damier.*/
    private int nombrePion = 0;

    /**
     * Constructeur d'un damier avec la création des 50 cases jouables.
     */
    public Damier() {
        for (int i = 0; i < 50; i++) {
            damier.add(null);
        }
    }

    /**
     * Méthode permettant d'ajouter un pion dans le damier.
     *
     * @param position choisi pour placer le pion.
     * @param pion choisi pour être placé sur une certaine position .
     */
    public void ajouterPion(int position, Pion pion) {
        damier.set(position, pion);
        nombrePion++;
    }

    /**
     * Méthode permettant d'aller chercher un pion dans le damier par rapport à sa position.
     *
     * @param position du pion sur le damier.
     * @return le pion par rapport à la position demandée
     */
    public Pion getPion(int position) {
        return damier.get(position);
    }

    /**
     * Méthode permettant de retourner le nombre de pion sur le damier.
     *
     * @return le nombre de pion.
     */
    public int getNombrePions() {
        return nombrePion;
    }
}
