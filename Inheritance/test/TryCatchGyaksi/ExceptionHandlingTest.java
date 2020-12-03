package TryCatchGyaksi;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class ExceptionHandlingTest {
    ExceptionHandling exceptionHandling;

    @Before
    public void setUp() {
        exceptionHandling = new ExceptionHandling();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnException() {
        exceptionHandling.string2Date("2020.11.25");
    }

    @Test
    public void shouldNotTrowException(){
        LocalDate date = exceptionHandling.string2Date("2020-11-25");
        Assert.assertEquals(2020, date.getYear());
        Assert.assertEquals(11, date.getMonthValue());
        Assert.assertEquals(25,date.getDayOfMonth());
    }

}