package OfficeHours.Practice_03_25_2020;

public class IfElse_Practice {
    public static void main(String[] args) {

        int num = 200;

        if (num % 2 != 0) {
            System.out.println(num + " is odd number");


        } else {
            System.out.println(num + " is even number");

        }

        int age = 21;

        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible");
        }

        boolean genderMale = true;
        if(genderMale){
            System.out.println("Gender is male");
        }else{
            System.out.println("Gender is female");
        }
    }
}
