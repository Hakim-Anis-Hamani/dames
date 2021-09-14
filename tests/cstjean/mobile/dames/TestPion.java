package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Tests de la classe Pion.
 *
 * @author Hakim-Anis Hamani
 */
public class TestPion extends TestCase {

    /**
     * Methode pour la création des test.
     */
    public void testCreer() {
        String couleur1 = "Noir";
        Pion pion1 = new Pion(couleur1);

        String couleur2 = "Blanc";
        Pion pion2 = new Pion(couleur2);

        Pion pion3 = new Pion();

        assertEquals("Noir", pion1.getCouleur());
        assertEquals("Blanc", pion2.getCouleur());
        assertEquals("Blanc", pion3.getCouleur());

    }
}
