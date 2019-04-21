package PeopleForTasting;

import org.junit.Test;
import java.util.ArrayList;

public class CookTest {

        @Test(expected = IllegalArgumentException.class)
        public void testNullArg() throws Exception {
            new Cook().eat(null);
        }

        @Test(expected = IllegalArgumentException.class)
        public void testEmptyList() throws Exception {
            new Cook().eat(new ArrayList());
        }

    }
