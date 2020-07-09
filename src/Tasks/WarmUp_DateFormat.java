package Tasks;

public class WarmUp_DateFormat {
    /*
     1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays
Collapse

     */

    public static void main(String[] args) {
        String result = "";
        String []friends = {"Aysa", "Eugene", "Tina", "Doug", "Elistina"};
        //                    0         1       2        3        4
        String[] localDates = {"12/22/86", "08/21/86","05/02/87","12/15/81","02/26/87"};
        //                         0           1          2          3          4

        //      a               b
        friends[0] = localDates[0];
        friends[1] = localDates[1];
        friends[2] = localDates[2];
        friends[3] = localDates[3];
        friends[4] = localDates[4];
        for(int a = 0; a>=friends.length-1; a++){

            for(int b = 0; b>=localDates.length-1; b++){
                result = friends[a]+ localDates[b];

            }
        }
        System.out.println(result);




    }
}
