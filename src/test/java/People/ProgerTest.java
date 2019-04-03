package People;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProgerTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNullArg() throws Exception {
        new Proger().eat(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList() throws Exception {
        new Proger().eat(new ArrayList());
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldReturnNonNullValue() {
        Proger proger = new Proger();
        assertNotNull(proger.coding());
    }

    @Test
    public void shouldReturnStringWithLengthMoreTHanOne(){
        Proger proger = new Proger();
        assertTrue(proger.coding().length()>1);
    }
}