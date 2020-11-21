package no.njm.calculator;

import no.njm.math.MathLibrary;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {
    private static final Logger log = LogManager.getLogger(Calculator.class);

    private final MathLibrary mathLibrary;

    Calculator() {
        mathLibrary = new MathLibrary();
    }

    int add(int x, int y) {
        return mathLibrary.add(x, y);
    }

    public static void main(final String... args) {
        log.traceEntry();
        var calc = new Calculator();
        var result = calc.add(3, 5);
        log.debug("Added {} and {} to {}.", 3, 5, result);
    }
}
