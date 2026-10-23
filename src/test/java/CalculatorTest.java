import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



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

}
