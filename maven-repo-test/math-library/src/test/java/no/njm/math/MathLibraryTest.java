package no.njm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathLibraryTest {

    @Test
    public void addTwoNPositivityNumbers() {
        MathLibrary math = new MathLibrary();
        assertEquals(4, math.add(2, 2));
    }

    @Test
    public void addTwoNegativeNumbers() {
        MathLibrary math = new MathLibrary();
        assertEquals(-5, math.add(-2, -3));
    }

    @Test
    public void addOnePositiveAndOneNegativeNumber() {
        MathLibrary math = new MathLibrary();
        assertEquals(1, math.add(-2, 3));
    }

    @Test
    public void addOnePositiveNumberToZero() {
        MathLibrary math = new MathLibrary();
        assertEquals(2, math.add(2, 0));
    }

    @Test
    public void addTwoZeros() {
        MathLibrary math = new MathLibrary();
        assertEquals(0, math.add(0, 0));
    }
}
