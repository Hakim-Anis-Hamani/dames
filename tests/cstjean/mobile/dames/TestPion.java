package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Tests de la classe Pion.
 *
 * @author Hakim-Anis Hamani
 */
public class TestPion extends TestCase {

    /**
     * Methode pour la création des test de la classe Pion.
     */
    public void testCreer() {
        Pion.Couleur couleur1 = Pion.Couleur.Noir;
        Pion pion1 = new Pion(couleur1);

        Pion.Couleur couleur2 = Pion.Couleur.Blanc;
        Pion pion2 = new Pion(couleur2);

        Pion pion3 = new Pion();

        assertEquals(Pion.Couleur.Noir, pion1.getCouleur());
        assertEquals(Pion.Couleur.Blanc, pion2.getCouleur());
        assertEquals(Pion.Couleur.Blanc, pion3.getCouleur());

        assertTrue(pion1.estNoir());
        assertFalse(pion2.estNoir());
        assertFalse(pion3.estNoir());

        assertEquals("P", pion1.getRepresentation());
        assertEquals("p", pion2.getRepresentation());
        assertEquals("p", pion3.getRepresentation());

    }
}
