package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10, 25 );
        System.out.println(date1);

        LocalDate birthDate = LocalDate.of(1986, 12, 22);
        System.out.println(birthDate);

        // isAfter(date2)
        boolean result1 = date1.isAfter(birthDate);
        System.out.println(result1); // true

        //isBefore(date2)
        boolean result2 = date1.isBefore(birthDate);
        System.out.println(result2); // false

        // isEqual(date2)
        boolean result3 = date1.isEqual(birthDate);//false
        System.out.println(result3);

        // isLeapYear(date2)
        boolean result4 = birthDate.isLeapYear();
        System.out.println(result4);//false

        System.out.println("==================================================================");

        LocalDate now = LocalDate.now();//2020-04-23
        System.out.println("Today is: "+now);

       String str = now.toString();
        System.out.println(str.replace("-","/")); //2020/04/23









    }


}
