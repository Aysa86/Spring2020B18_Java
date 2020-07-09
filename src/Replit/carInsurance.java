package Replit;
import java.util.*;

public class carInsurance {



        public static void main(String[] args) {
            double premium = 0;
            int accidentsAmount = 0;
            int daysDrivenToWorkOrSchool = 0;
            int milesToWorkOrSchool = 0;
            String vehicleOwnership = "";
            String vehicleUsage = "";
            String continuousInsurance = "";
            String education = "";
            String name = "";
            String referenceNumber = "";
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the CountyFarm car insurance!");

            //WRITE YOUR CODE HERE

            System.out.println("Enter your name");
            name = scan.nextLine();
            System.out.println("Do you have a US driver license?");
            String license = scan.next();
            if (license.equalsIgnoreCase("No")) {
                System.out.println("Invalid data!");
                System.exit(0);}
            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();
            if (zipCode == 20910 || zipCode == 20740) {
                premium += 60;
            } else if (zipCode == 22102 || zipCode == 22103) {
                premium += 30;
            } else {
                premium += 50;}
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();
            if (vehicleOwnership.equalsIgnoreCase("owned")) {
                premium += 10;
            } else {
                premium += 20;}
            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();
            if (vehicleUsage.equalsIgnoreCase("Business")) {
                premium += 50;
            } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
                premium += 10;
            } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += daysDrivenToWorkOrSchool * 5;
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool * 1;}
            System.out.println("How old are you?");
            int age = scan.nextInt();
            if (accidentsAmount>=25) {
                premium *= 1;
            } else if (age<16) {System.out.println("Invalid data!");
                System.exit(0);
            } else if (age >= 16 && age < 18) {
                premium *= 20;
            } else if (age >= 18 && age <= 21) {
                premium *= 6;
            } else if (age > 21 && age < 25) {
                premium *= 2;}
            System.out.println("How many years you've been driving?");
            int drivingExperience = scan.nextInt();
            boolean experience = age - drivingExperience >= 16;
            if (!experience) {System.out.println("Invalid data!");
                System.exit(0);
            } else if (experience) {
                premium -= drivingExperience * 5;}
            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents = scan.next();
            if (accidents.equalsIgnoreCase("Yes")) {
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                premium +=(premium*20 / 100*(accidentsAmount));}
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();
            if (continuousInsurance.equalsIgnoreCase("No")) {
                premium *= 2;}
            scan.nextLine();
            System.out.println("What is the highest level of education you have completed?");
            education = scan.nextLine();
            if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")
                    || education.equalsIgnoreCase("Masters")) {
                premium -= premium * 5 / 100;
            } else if (education.equalsIgnoreCase("Doctors")) {
                premium -= premium * 10 / 100;
            } else if (education.equalsIgnoreCase("Less than High School")) {
                premium +=premium*5 / 100;}
            referenceNumber = (name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode
                    + education.replace(" ", "")).toUpperCase();
            System.out.println(name + ", here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);
            System.out.println("Reference number: " + referenceNumber);




        }

    }

