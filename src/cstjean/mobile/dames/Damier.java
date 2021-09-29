package cstjean.mobile.dames;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Information pour l'objet Damier.
 *
 * @author Hakim-Anis Hamani
 */
public class Damier {

    /**Positions du damier.*/
    private final Map<Integer, Pion> damier = new LinkedHashMap<>();

    /**Saut de ligne.*/
    static final String SAUT_LIGNE = System.getProperty("line.separator");

    /**
     * Constructeur d'un damier avec la création des 50 cases jouables.
     */
    public Damier() {
        for (int i = 1; i < 51; i++) {
            damier.put(i, null);
        }
    }

    /**
     * Méthode permettant d'initialiser le damier.
     *
     * @return Représentation graphique du damier.
     */
    public String initialiser() {

        for (int i = 1; i < 51; i++) {
            if (i < 21) {
                damier.put(i, new Pion(Pion.Couleur.Noir));
            }

            if (i > 30) {
                damier.put(i, new Pion(Pion.Couleur.Blanc));
            }
        }
        StringBuilder builder = new StringBuilder();

        int compteur = 0;
        for (Integer key : damier.keySet()) {
            Pion pion = damier.get(key);
            if (pion != null && (pion.estNoir() || pion.getCouleur() == Pion.Couleur.Blanc)) {
                compteur++;
                if (compteur <= 5) {
                    builder.append("-").append(pion.getRepresentation());
                    if (compteur == 5) {
                        builder.append(SAUT_LIGNE);
                    }
                }
                if (compteur > 5) {
                    builder.append(pion.getRepresentation()).append("-");
                    if (compteur == 10 && key != 49) {
                        builder.append(SAUT_LIGNE);
                    }
                }
                if (compteur >= 10) {
                    compteur = 0;
                }
            } else {
                compteur++;
                if (compteur <= 5) {
                    builder.append("--");
                    if (compteur == 5) {
                        builder.append(SAUT_LIGNE);
                    }
                }
                if (compteur > 5) {
                    builder.append("--");
                    if (compteur == 10) {
                        builder.append(SAUT_LIGNE);
                    }
                }
                if (compteur >= 10) {
                    compteur = 0;
                }
            }
        }
        return builder.toString();
    }

    /**
     * Méthode permettant d'ajouter un pion dans le damier.
     *
     * @param position choisi pour placer le pion.
     * @param pion choisi pour être placé sur une certaine position .
     */
    public void ajouterPion(int position, Pion pion) {
        damier.put(position, pion);
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
        int nombrePions = 0;

        for (Integer key : damier.keySet()) {
            Pion pion = damier.get(key);
            if (pion != null) {
                nombrePions++;
            }
        }
        return nombrePions;
    }

    /**
     * Méthode permettant de retourner le nombre de pion d'une certaines couleur sur le damier.
     *
     * @param couleur demandé pour la recherche
     * @return le nombre de pion d'une certaine couleur.
     */
    public int getNombrePionCouleur(Pion.Couleur couleur) {
        int nombrePions = 0;

        for (Integer key : damier.keySet()) {
            Pion pion = damier.get(key);
            if (pion != null) {
                if (pion.getCouleur() == couleur) {
                    nombrePions++;
                }
            }
        }
        return nombrePions;
    }
}
