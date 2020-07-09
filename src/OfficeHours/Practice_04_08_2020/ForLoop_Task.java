package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        /*
        print all numbers that can be divisible by 3 or 5 between 0 ~ 100
         */

        for(int a = 0; a <= 100; a++) {
            if (a % 3 == 0 || a % 5 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();

        System.out.println("=================================================");
             //length: 1234
        String name = "Aysa";
                 //    0123
        String result = ""; // asyA
           int lastIndexNumber = name.length()-1;

           for(int b = lastIndexNumber; b >=0; b--){
               //result += name.charAt(b);
               result = result + name.substring(b, b + 1);
           }

        System.out.println(result);

        if(name.equalsIgnoreCase(result)){
            System.out.println(name+" is palindrome");
        }else{
            System.out.println(name+" is not palindrome");
        }




    }
}
