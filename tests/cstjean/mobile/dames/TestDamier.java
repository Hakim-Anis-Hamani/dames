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

        final String Saut_Ligne = System.getProperty("line.separator");

        Pion.Couleur couleur1 = Pion.Couleur.Noir;
        Pion pion1 = new Pion(couleur1);

        Pion.Couleur couleur2 = Pion.Couleur.Blanc;
        Pion pion2 = new Pion(couleur2);

        Damier damier = new Damier();

        damier.ajouterPion(39, pion1);
        assertEquals(1, damier.getNombrePions());

        damier.ajouterPion(43, pion2);
        assertEquals(2, damier.getNombrePions());

        assertEquals(pion1, damier.getPion(39));
        assertEquals(pion2, damier.getPion(43));

        assertEquals(Pion.Couleur.Noir, damier.getPion(39).getCouleur());
        damier.initialiser();
        String testDamier =
                "-P-P-P-P-P" + Saut_Ligne +
                "P-P-P-P-P-" + Saut_Ligne +
                "-P-P-P-P-P" + Saut_Ligne +
                "P-P-P-P-P-" + Saut_Ligne +
                "----------" + Saut_Ligne +
                "----------" + Saut_Ligne +
                "-p-p-p-p-p" + Saut_Ligne +
                "p-p-p-p-p-" + Saut_Ligne +
                "-p-p-p-p-p" + Saut_Ligne +
                "p-p-p-p-p-";

        assertEquals(damier.initialiser(), testDamier);

        assertEquals(20, damier.getNombrePionCouleur(Pion.Couleur.Noir));

    }
}