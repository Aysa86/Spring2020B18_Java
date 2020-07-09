package day03_VariablesContinue;

public class SalaryCalculator {




    public static void main(String[] args) {

        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte weeksInAYear = 52;

        // salary = hourlyRate * weeklyHours * 52 weeks a year

        double salary = hourlyRate * weeklyHours * weeksInAYear;
        //total salary before tax
        //stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;
        //federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;
        //salary after tax = salary - stateTax - federalTax;
        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your salary is: $ "+salary);

        System.out.println("State tax is: $ "+stateTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("Total Tax is: $"+(federalTax + stateTax)  );
        System.out.println("Salary after tax is: $"+salaryAfterTax);








        /*
        System.out.println("9"+ 3); // 93 bc it is concatenation;
        System.out.println(9 + "3"); //93 bc it is concatenation;
        System.out.println(9 + 3); // addition

         */





    }
}
