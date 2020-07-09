package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate date1 = LocalDate.now();//2020-04-23
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEE/MMM/dd/yy");
        LocalDate birthDay = LocalDate.of(1986, 12,22);
        String str = birthDay.format(dtf1);
        System.out.println(str);


        LocalDate today = LocalDate.now();
        System.out.println(today.format(dtf1));

    }
}
