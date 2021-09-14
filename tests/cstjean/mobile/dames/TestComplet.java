package cstjean.mobile.dames;

import junit.framework.TestSuite;

/**
 * Classe pour la création de Suite de tests.
 *
 * @author Hakim-Anis Hamani
 */
public class TestComplet {
    /**
     * Methode pour créer la suite de test
     *
     * @return suite de test
     */
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestPion.class);
        suite.addTestSuite(TestDamier.class);
        return suite;
    }

}