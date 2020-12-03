package Interrogation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BadGuyTest {

    BadGuy bG;

    @Before
    public void setUp() {
        bG = new BadGuy();
    }

    @Test
    void confessTest() {
        NaivGuy nG = new NaivGuy();
        assertTrue(bG.confess(bG));
        assertTrue(bG.confess(nG));
    }
}