package no.njm.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void AddTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 2), 4);
    }
}
