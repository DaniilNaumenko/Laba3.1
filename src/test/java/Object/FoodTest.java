package Object;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tasteToString() {
        Food food = new Food("food");
        assertEquals("Tasteless", food.tasteToString());
    }
}