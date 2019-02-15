package no.njm.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathLibraryTest {

    @Test
    public void addTwoNPositivityNumbers() {
        MathLibrary math = new MathLibrary();
        assertEquals("2 + 2 should be 4", 4, math.add(2, 2));
    }

    @Test
    public void addTwoNegativeNumbers() {
        MathLibrary math = new MathLibrary();
        assertEquals("-2 + -3 should be -5", -5, math.add(-2, -3));
    }

    @Test
    public void addOnePositiveAndOneNegativeNumber() {
        MathLibrary math = new MathLibrary();
        assertEquals("-2 + 3 should be 1", 1, math.add(-2, 3));
    }

    @Test
    public void addOnePositiveNumberToZero() {
        MathLibrary math = new MathLibrary();
        assertEquals("2 + 0 should be 2", 2, math.add(2, 0));
    }

    @Test
    public void addTwoZeros() {
        MathLibrary math = new MathLibrary();
        assertEquals("0 + 0 should be 0", 0, math.add(0, 0));
    }
}
