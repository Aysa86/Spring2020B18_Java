package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25, 11, 30,45);
        System.out.println(dateTime1);

        // 12/25/2015 11:30 am, Friday

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a EEEE");
        System.out.println(dateTime1.format(dtf));


    }
}
