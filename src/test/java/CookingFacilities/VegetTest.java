package CookingFacilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VegetTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void colorToString() {

        Veget color = new Veget("сolor");
        assertEquals("Colorless", color.colorToString());
    }

    @Test
    public void vegetableToString() {
        Veget veget = new Veget("food");
        assertEquals("Vegetable", veget.vegetableToString());
    }
}