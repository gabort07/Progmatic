package TryCatchGyaksi;

import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ThoughtANumberTest {

    ThoughtANumber thoughtANumber;

    @Before
    public void setUp() throws Exception {
        thoughtANumber = new ThoughtANumber();
    }

    @Test(expected = InputMismatchException.class)
    public void ShouldReturnException() {
    }
}