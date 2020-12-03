import com.company.Teszt_2020_10_09;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class Teszt_2020_10_09Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLastNumber() {
        int lastNumber = Teszt_2020_10_09.getLastNumber(new int[]{1,2,3,6});
        assertEquals("Nem stimmel az utolsó szám",7, lastNumber);
    }

    @Test
    void countEvenNumbers() {
        int evenNumber = Teszt_2020_10_09.countEvenNumbers(new int[]{1,2,3,4,5,6,7});
        assertEquals("Több vagy kevesebb a páros szám",4, evenNumber);
    }

    @Test
    void countSameNumbers() {
        int counter = Teszt_2020_10_09.countSameNumbers(new int[]{0,2,3,4,6,8,10}, new int[]{0,1,2,3,4,5,6,7});
        assertEquals(" Több közös szám van", 4,counter);
        assertEquals(5,counter, "Stimmel");
    }

    @Test
    void matrixTopLeftNumber() {
    }

    @Test
    void matrixDiagonalDifference() {
    }

    @Test
    void stairs() {
        System.out.println("hello");
    }
}