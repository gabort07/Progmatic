package Interrogation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EyeToEyeStrictlyTest {

    EyeToEyeStrictly strictly;

    @Before
    public void setUp(){
        strictly = new EyeToEyeStrictly();
    }

    @Test
    public void confessTest(){
        BadGuy bg = new BadGuy();
        assertFalse(strictly.confess(bg));

    }
    @Test
    public void shouldConfessIfOtherConfessedBefore(){
        BadGuy bg = new BadGuy();
        NaivGuy ng = new NaivGuy();
        strictly.setPunishment(bg, 3);
        strictly.setPunishment(ng,1);
        assertTrue(strictly.confess(bg));
        assertFalse(strictly.confess(ng));
    }

    @Test
    public void neverForget(){
        BadGuy bg = new BadGuy();
        NaivGuy ng = new NaivGuy();
        strictly.setPunishment(bg, 3);
        strictly.setPunishment(bg, 1);
        strictly.setPunishment(bg, 1);
        assertTrue(strictly.confess(bg));

    }

}