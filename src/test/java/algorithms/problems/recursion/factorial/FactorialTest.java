package algorithms.problems.recursion.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorial() {

        assertEquals(120, new Factorial().factorial(5));

    }

    @Test
    public void tailFactorial() {

        assertEquals(120, new Factorial().tailFactorial(5));

    }
}
