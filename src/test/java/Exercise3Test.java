import org.junit.*;
import static org.junit.Assert.*;

public class Exercise3Test {
    Exercise3 toTest;

    @Before
    public void setup(){
        toTest = new Exercise3();
    }

    /* Test the Arg Parsing funciton of the program */
    @Test
    public void testParseNullArgs(){
        assertEquals(toTest.parse(null), -1);
    }

    @Test
    public void testParseNegativeArgs(){
        String[] arg = {"-44544"};
        assertEquals(toTest.parse(arg), -1);
    }

    @Test
    public void testParseNonIntInput(){
        String[] arg = {"arglefargle"};
        assertEquals(arg, -1);
    }

    /* Test the Triangle Number funciton of the program */
    @Test
    public void testTriNegativeArgs(){
        assertEquals(toTest.triN(-44544), -1);
    }

    @Test
    public void testTriZero(){
        assertEquals(toTest.triN(0), 0);
    }

    @Test
    public void testTriHappy(){
        assertEquals(toTest.triN(5), 15);
    }

    /* Test the Lazy Caterer funciton of the program */
    @Test
    public void testLazyNegativeArgs(){
        assertEquals(toTest.lazyN(-44544), -1);
    }

    @Test
    public void testLazyZero(){
        assertEquals(toTest.lazyN(0), 1);
    }

    @Test
    public void testLazyHappy(){
        assertEquals(toTest.lazyN(5), 16);
    }
}
