import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    //Following Build, Operate, Check
    @Test
    public void testSumPositive(){
        int expected = 3;
        int actual = calculator.sum(1, 2); //1+2=3
        assertEquals(expected,actual, "the given sum is not equal to expected");
    }

    @Test
    public void testNegative(){
        int expected = -3;
        int actual = calculator.sum(-1, -2); //1+2=3
        assertEquals(expected,actual, "the given negative test is not equal to expected");
    }

    @Test
    public void testSumZero(){
        int expected = 0;
        int actual = calculator.sum(0, 0); //1+2=3
        assertEquals(expected,actual, "the sum of zeros is not equal zero");
    }

    @Test
    public void testSubtractPositive(){
        int expected = 1;
        int actual = calculator.subtract(2, 1); //2-1=1
        assertEquals(expected,actual, "subtracting the given two positive numbers is not equal to expected");
    }

    @Test
    public void testSubtractNegative(){
        int expected = -1;
        int actual = calculator.subtract(-2, -1); //-2-(-1)=-1
        assertEquals(expected,actual, "substracting negative numbers is not giving expected result");
    }

    @Test
    public void testMultiply(){
        int expected = 2;
        int actual = calculator.multiply(2, 1); //2*1=2
        assertEquals(expected,actual, "multiplying the two numbers is not giving the expected result");
    }

    @Test
    public void testMultiplyZero(){
        int expected = 0;
        int actual = calculator.multiply(0, 1); //0*1=0
        assertEquals(expected,actual, "multiplying by zero is not giving zero");
    }

    @Test
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
        String expectedMessage = "Ints can NOT be divided by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage, "the exception is not being thrown for dividing by zero");
    }

    @Test
    public void testDivide(){
        double expected = 0.5;
        double actual = calculator.divide(1, 2); // 1/2=0.5
        assertEquals(expected,actual, "the division is not returning the correct result");
    }

    @Test
    public void testIsEven(){
        boolean actual = calculator.isEven(2);
        assertTrue(actual, "the even number being passed is not being shown as even");
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
