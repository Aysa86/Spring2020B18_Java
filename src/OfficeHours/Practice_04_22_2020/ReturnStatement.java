package OfficeHours.Practice_04_22_2020;

public class ReturnStatement {
    public static void main(String[] args) {

       /* if(10>9){
            return;
        }
        System.out.println("Hello");// its not be printed, bc "return" exits current method
                                    // it placed in main method
*/
       method1();
        System.out.println("Hello Batch 18");

    }
    public static void method1(){
        if(10>9){
            return;
        }
        System.out.println("Hello Cybertek");// never be executed
    }





}
