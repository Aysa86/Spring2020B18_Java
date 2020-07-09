package OfficeHours.Practice_04_22_2020;

public class Void_Method {
    public static void main(String[] args) {
      print();

      System.out.println("=====================================");

      Vote(18, true);

        System.out.println("===================================");

        BuyCigarettes(20);
    }

    public static void print() {
        for (int a = 0; a < 5; a++) {
            System.out.println("Hello Batch 18");// to print 5 times
        }

    }

    public static void Vote(int age, boolean USCitizen){
        boolean eligibleToVote = age >= 18 && USCitizen == true;
        if(eligibleToVote==true){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

    public static void BuyCigarettes(int age){
        if(age > 18){
            System.out.println("You are allowed to buy cigarettes");
        }else{
            System.out.println("You are allowed to buy milk");
        }
    }


}
