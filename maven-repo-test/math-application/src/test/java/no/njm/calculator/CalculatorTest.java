package no.njm.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void AddTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 2), 4);
    }
}
