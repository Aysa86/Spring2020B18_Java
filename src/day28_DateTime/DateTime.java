package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);//2020-04-24T11:21:21.204 global format


        //2020-03-20 11:25:30

        LocalDate date = LocalDate.of(2020, 3,20);
        LocalTime time = LocalTime.of(11, 25,30);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date1 = LocalDate.of(2019, 3,20);
        System.out.println(date1.format(dtf));



    }
}
