package com.people.tasting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProgrammerTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNullArg() throws Exception {
        new Programmer().eat(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList() throws Exception {
        new Programmer().eat(new ArrayList());
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldReturnNonNullValue() {
        Programmer programmer = new Programmer();
        assertNotNull(programmer.coding());
    }

    @Test
    public void shouldReturnStringWithLengthMoreTHanOne(){
        Programmer programmer = new Programmer();
        assertTrue(programmer.coding().length()>1);
    }
}