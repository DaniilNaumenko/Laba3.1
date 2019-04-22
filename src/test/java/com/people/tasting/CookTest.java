package com.people.tasting;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CookTest {
    public class KitchenTest {
        @Test
        public void cook() throws Exception {
            IRandom randomMock = new IRandom() {
                @Override
                public int nextInt(int i) {
                    return 0;
                }
            };
            List<Food> foods = new ArrayList<Food>();
            Cook k = new Cook(randomMock);
            k.cook(foods, "a", Veget.PEPPER);
            org.junit.Assert.assertEquals(foods.get(0).getTaste(), Taste.SWEET);
        }
    }

}
