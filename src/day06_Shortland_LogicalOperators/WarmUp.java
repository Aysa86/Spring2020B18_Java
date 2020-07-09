package day06_Shortland_LogicalOperators;

public class WarmUp {


    public static void main(String[] args) {

        /*1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785 galons
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
         */


        double numberOfGallons = 1;
        double gallonsToLiters = numberOfGallons * 3.785;
        String result = numberOfGallons + " is equal to " + gallonsToLiters + " liters ";
        System.out.println(result);


        double numberOfLiters = 1;
        double litersToGallons = numberOfLiters / 3.785;
        String result2 = numberOfLiters + " liters equal to " + litersToGallons + " gallons";
        System.out.println(result2);


        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //b = -200 + -200 *200 % 2;
        // b = -200 + -4000 % 2;
        //b = -200 + 0;
        //b = -200;
        System.out.println(b); // -200
        System.out.println(a); //199;


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        // z = 300 + 400 - 300 * 400 + 300/400;
        // z = 300 + 400 - 120000 + 300 / 400; 300/400 ==> 0.75, as its decimal, compiler will take 0;
        // z = 300 + 400 - 12000 + 0;
        // z = 700 +









    }


}
