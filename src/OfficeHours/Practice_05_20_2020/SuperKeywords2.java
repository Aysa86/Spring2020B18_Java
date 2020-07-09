package OfficeHours.Practice_05_20_2020;


class TestData{
    int num = 100;
    String name = "Cybertek";


    public void method(){
        System.out.println("Cybertek School");
    }

}


public class SuperKeywords2 extends TestData {
       int num = 200;
       String name = "MIT";


       public void method(){
           System.out.println("MIT School");
       }

       public SuperKeywords2(){
           method(); //"MIT School" ==> current class
          super.method(); // "Cybertek School" ==> super class
           System.out.println(num); // 200 ==> current class
           System.out.println(super.num); // 100 ==> super class
           System.out.println(super.name); // "Cybertek"
       }

    public static void main(String[] args) {

           SuperKeywords2 obj = new SuperKeywords2();



    }


}
