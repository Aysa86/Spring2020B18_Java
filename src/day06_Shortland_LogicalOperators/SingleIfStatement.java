package day06_Shortland_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {


        boolean coldWeather = true; // if false ==> nothing happens
        if(coldWeather){
           //true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");


        }




        boolean coronaDetected = false; //if true "Buy more toilet paper", etc.;
        if(coronaDetected){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");


        }


        int a = 100;
        boolean evenNumber = a % 2 == 0; // if a number can be divided by 2 without remainder;
        boolean oddNumber = a % 2 != 0; // if a number can not be divided by 2 evenly;


        if(evenNumber){
            System.out.println(a + " is even number");
        }

        if(oddNumber){
            System.out.println(a + " is odd number"); // false, compiler will not execute;


        }



    }
}
