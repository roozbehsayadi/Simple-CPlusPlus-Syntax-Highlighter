package syntaxhighlighter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for our App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create Scanner
     *

     */
    public void testConstruct()
    {
        MyScanner yylex = new MyScanner( null );
        assertNotNull(yylex);

    }

}
