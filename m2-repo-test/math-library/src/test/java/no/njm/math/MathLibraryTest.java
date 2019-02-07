package no.njm.math;

import no.njm.math.MathLibrary;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathLibraryTest {
    
    @Test 
    public void addTwoNumbersSuccessfully() {
        MathLibrary math = new MathLibrary();
        assertEquals("2 + 2 is 4", 4, math.add(2, 2));
    }
}
