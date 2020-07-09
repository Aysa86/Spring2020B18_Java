package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    /*
    1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
     */
    public static void main(String[] args) {

        String []friends = {"Aysa", "Eugene", "Ekaterina"};

        LocalDate AysaBirthday = LocalDate.of(1986,12,22);
        LocalDate EugeneBirthday = LocalDate.of(1986, 8, 21 );
        LocalDate EkaterinaBirthday = LocalDate.of(1962, 12, 8);

        LocalDate [] birthdays = {AysaBirthday, EugeneBirthday, EkaterinaBirthday};

        for (int a = 0; a < friends.length; a++){
            String name = friends[a];
            LocalDate birthday = birthdays[a];
            System.out.println(name+"'s birthday is "+birthday);
        }









    }
}
