package SmartHouse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoorTest {

    Door door;

    @Before
    public void setUp() throws Exception {
       door = new Door();
    }

    @Test
    public void doorShouldReturnTrue() {
        door.open();
        assertTrue(door.opened);
    }

    @Test
    public void doorShouldReturnFalse() {
        door.close();
        assertFalse(door.opened);
    }

    @Test
    public void returnSpecialChar(){
        assertEquals("\u25AE", door.toString());
        door.open();
        assertEquals("\u25AF", door.toString());
        door.close();
        assertEquals("\u25AE", door.toString());

    }
}