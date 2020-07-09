package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

               String str =  scan.next();

        System.out.println(str);// next() takes the first word;


        String fullAdress = "";
        System.out.println("Enter the number of the building: ");
         short BNumber = scan.nextShort();
         fullAdress+=BNumber+" ";

        System.out.println("Enter the street name: ");
        String streetName = scan.next();
        fullAdress+= streetName+" ";

        System.out.println("Enter the type of the road: ");
        String roadType = scan.next();
        fullAdress+=roadType+" "+", ";

        System.out.println("Enter the city name, state, zip code: ");
        String cityName = scan.next();
        fullAdress+=cityName+" ";

        String stateName = scan.next();
        fullAdress+=stateName+", ";

        int zipCode = scan.nextInt();
        fullAdress+=zipCode;

        System.out.println("Address is: "+fullAdress);




    }
}
