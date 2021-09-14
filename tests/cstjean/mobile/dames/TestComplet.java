package cstjean.mobile.dames;

import junit.framework.TestSuite;

public class TestComplet {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestPion.class);
        suite.addTestSuite(TestDamier.class);
        return suite;
    }

}