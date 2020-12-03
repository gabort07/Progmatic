package SmartHouse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigWindowTest {
    BigWindow bigWindow;

    @Before
    public void setUp() throws Exception {
        bigWindow = new BigWindow();
    }

    @Test
    public void doorShouldReturnTrue() {
        bigWindow.open();
        assertTrue(bigWindow.opened);
    }

    @Test
    public void doorShouldReturnFalse() {
        bigWindow.close();
        assertFalse(bigWindow.opened);
    }

    @Test
    public void returnSpecialChar() {
        assertEquals("\u25A0" + "\u25A0", bigWindow.toString());
        bigWindow.open();
        assertEquals("\u25A1" + "\u25A1", bigWindow.toString());
        bigWindow.close();
        assertEquals("\u25A0" + "\u25A0", bigWindow.toString());
    }
}