package exercise.date.time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Start {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter time1 = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
        System.out.println(time.format(time1));

        ZonedDateTime time2 = ZonedDateTime.now();
        System.out.println(time2);



    }
}
   /* calculate and print:
        using LocaleDateTime, the current date and time in the following format:
        DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
        using ZonedDateTime, the current date and time in ISO Zoned Date Time format*/