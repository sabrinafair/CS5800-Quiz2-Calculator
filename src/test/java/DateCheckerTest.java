import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Months.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    public void test31DayMonths(DateChecker.Months month){
        assertTrue(dateChecker.has31days(month), "The given month does not have 31 days");
    }


    @ParameterizedTest
    @EnumSource(value = DateChecker.Months.class, names = { "FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testNot31DayMonths(DateChecker.Months month){
        assertFalse(dateChecker.has31days(month), "The month passed does have 31 days");
    }

    @Test
    public void testInvalidInput(){
        DateChecker.Months actual = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateChecker.has31days(actual));
        String expectedMessage = "NULL Input not allowed";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage, "The input was not null");
    }
}
