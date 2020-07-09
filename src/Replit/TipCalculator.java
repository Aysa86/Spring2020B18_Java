package Replit;
import java.util.Scanner;
public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String split = input.next();

        System.out.println("Number of people entered: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Service quality:");
        String service = input.next();

        System.out.println("Check amount:");
        double amount = input.nextDouble();
        double totaltip = 0;
        switch (numberOfPeople){
            case 1:
                System.out.println("Number of people entered: "+"&");
                break;
            case 2:
                System.out.println("Number of people entered: "+"&&");
                break;
            case 3:
                System.out.println("Number of people entered: "+"&&&");
                break;
            case 4:
                System.out.println("Number of people entered: "+"&&&&");
                break;
            case 5:
                System.out.println("Number of people entered: "+"&&&&&");
            default:
        }
        if (service.equalsIgnoreCase("poor")){
            totaltip=amount*0.05;
        } if (service.equalsIgnoreCase("fair")){
            totaltip=amount*0.1;
        } if (service.equalsIgnoreCase("good")){
            totaltip=amount*0.15;
        } if (service.equalsIgnoreCase("great")){
            totaltip=amount*0.2;
        } if (service.equalsIgnoreCase("excellent")){
            totaltip=amount*0.25;
        }
        System.out.println("Total to pay: " + (amount+totaltip));//595
        System.out.println("Total tip: " + totaltip);//119
        System.out.println("Total per person: "+(amount+totaltip)/numberOfPeople);
        System.out.println("Tip per person: "+totaltip/numberOfPeople);
    }
}









