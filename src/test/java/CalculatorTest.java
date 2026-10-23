import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    //Following Build, Operate, Check
    @Test
    public void testSum(){
        int expected = 3;
        int actual = calculator.sum(1, 2); //1+2=3
        assertEquals(expected,actual);
    }

    @Test
    public void testSubtract(){
        int expected = 1;
        int actual = calculator.subtract(2, 1); //2-1=1
        assertEquals(expected,actual);
    }

    @Test
    public void testMultiply(){
        int expected = 2;
        int actual = calculator.multiply(2, 1); //2*1=2
        assertEquals(expected,actual);
    }

    @Test
    public void testDivide(){
        double expected = 0.5;
        double actual = calculator.divide(1, 2); // 1/2=0.5
        assertEquals(expected,actual);
    }

    @Test
    public void testIsEven(){
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void testIsOdd(){
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }

    @Test
    public void testIncrementArray(){
        int[] expected = new int[]{2,3,4};
        int[] actual = calculator.incrementArrays(new int[]{1,2,3});
        assertArrayEquals(expected,actual);
    }
}
