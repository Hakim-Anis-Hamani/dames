package cstjean.mobile.dames;

import junit.framework.TestCase;

/**
 * Test de la classe Dame.
 *
 * @author Hakim-Anis Hamani
 */
public class TestDame extends TestCase {

    /**
     * Methode pour la création des test de la classe Dame.
     */
    public void testCreer() {

        Pion dame1 = new Dame();
        Pion dame2 = new Dame(Pion.Couleur.Noir);
        Pion dame3 = new Dame(Pion.Couleur.Blanc);

        assertEquals(dame1.getCouleur(), Pion.Couleur.Blanc);
        assertEquals(dame2.getCouleur(), Pion.Couleur.Noir);
        assertEquals(dame3.getCouleur(), Pion.Couleur.Blanc);

        assertEquals("d", dame1.getRepresentation());
        assertEquals("D", dame2.getRepresentation());
        assertEquals("d", dame3.getRepresentation());

        assertFalse(dame1.estNoir());
        assertTrue(dame2.estNoir());
        assertFalse(dame3.estNoir());
    }
}
