package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Test de la classe Damier.
 *
 * @author Hakim-Anis Hamani
 */
public class TestDamier extends TestCase {

    /**
     * Methode pour la création des test de la classe Damier.
     */

    public void testCreer() {
        Pion.Couleur couleur1 = Pion.Couleur.Noir;
        Pion pion1 = new Pion(couleur1);

        Pion.Couleur couleur2 = Pion.Couleur.Blanc;
        Pion pion2 = new Pion(couleur2);

        Damier damier = new Damier();

        damier.ajouterPion(38, pion1);
        assertEquals(1, damier.getNombrePions());

        damier.ajouterPion(42, pion2);
        assertEquals(2, damier.getNombrePions());

        assertEquals(pion1, damier.getPion(38));
        assertEquals(pion2, damier.getPion(42));

        assertEquals(Pion.Couleur.Noir, damier.getPion(38).getCouleur());

        damier.initialiser();
    }
}