package People;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FarmerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void water() { assertThrows(IllegalArgumentException.class, () -> new Farmer().water()); }

    @Test
    public void collect() {
        assertThrows(IllegalArgumentException.class, () -> new Farmer().collect());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArg() throws Exception {
        new Farmer().eat(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList() throws Exception {
        new Farmer().eat(new ArrayList());
    }
}