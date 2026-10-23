import java.util.Arrays;

public class DateChecker {
    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private DateChecker.Months[] months31Days = {Months.JANUARY,Months.MARCH,Months.MAY,Months.JULY,Months.AUGUST,Months.OCTOBER,Months.DECEMBER};

    public boolean has31days(Months month){
        if(month == null) throw new IllegalArgumentException("NULL Input not allowed");
        return Arrays.toString(months31Days).contains(month.toString());
    }
}
