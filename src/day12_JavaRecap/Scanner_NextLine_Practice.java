package day12_JavaRecap;
import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //7921 JonesBranch Dr, McLean VA, 22034
        //fullAddress:BuildingNumber,Street,city,state,zip code

        System.out.println("Enter building number: ");
        int BNumber = input.nextInt();


         input.nextLine();// used to take out "Enter";
        System.out.println("Enter your street: ");
        String street = input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();//22034+Enter;


        input.nextLine();// take out Enter;
        System.out.println("Enter your city and state separated by comma and space: ");
        String cityState= input.nextLine();

        String fullAddress = BNumber+" "+street+", \n"+cityState+" "+zipCode; //\n new line;

        System.out.println(fullAddress);

        input.close();// closes the scanner






    }
}
