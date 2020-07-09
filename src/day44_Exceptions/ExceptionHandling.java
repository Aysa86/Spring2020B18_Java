package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str = "Cybertek";

        try{
            System.out.println(str.charAt(100));
        }catch (RuntimeException e){
           String description = e.getMessage();
            System.out.println(description);//String index out of range: 100

        }
        System.out.println("==================================================");

        try {

            System.out.println(100 / 0);

        }catch(ArithmeticException e){
         //String description2 =  e.getMessage();
           // System.out.println(description2); //    / by zero
            System.out.println(e.getMessage());
        }

        System.out.println("Completed");

    }
}
