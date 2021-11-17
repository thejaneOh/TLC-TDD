package test;

import com.company.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{
    @Test
    public void testFactorial() {

        Main main = new Main();
        assertEquals(24, main.factorial(4));


    }

//test for Zero
    @Test
    public void test_ZeroFactorial() {

        Main main = new Main();
        assertEquals(1, main.factorial(1));


    }


    @Test
    public void testFibonacci() {
        Main main = new Main();
        assertEquals(0, main.fibonacci(0));


    }

}