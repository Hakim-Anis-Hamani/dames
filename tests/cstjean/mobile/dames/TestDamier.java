package cstjean.mobile.dames;

import junit.framework.TestCase;

public class TestDamier extends TestCase {

    public void testCreer() {
        String couleur1 = "Noir";
        Pion pion1 = new Pion(couleur1);

        String couleur2 = "Blanc";
        Pion pion2 = new Pion(couleur2);

        Damier damier = new Damier();
        damier.initialiseDamier();

        damier.ajouterPion(38, pion1);
        assertEquals( 1 , damier.getNombrePions());

        damier.ajouterPion(42, pion2);
        assertEquals( 2 , damier.getNombrePions());

        assertEquals( pion1 , damier.getPion(38));
        assertEquals( pion2 , damier.getPion(42));
        assertEquals("Noir", damier.getPion(38).getCouleur());
    }
}