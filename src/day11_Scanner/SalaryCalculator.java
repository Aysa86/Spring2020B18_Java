package day11_Scanner;

import java.util.Scanner;
public class SalaryCalculator {

    /* write a program that can calculate the salary after tax
        needed informations:
        employee' salaray
        state tax
        federal tax*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter the state tax: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax/100.0;

        System.out.println("Enter the federal tax: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax/100.0;


        double totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $" + salaryAfterTax);

        System.out.println("Total tax is: $" + totalTax);










    }



}
