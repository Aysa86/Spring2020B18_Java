package day44_Exceptions;

public class Task {
    /*
    1. Write a method called "wait" that causes the current executing
    thread to sleep for the specific number of seconds
     parameters: double seconds
     */

    public static void main(String[] args) {

        System.out.println("Hello");

         try{
           Thread.sleep(2000);

         }catch(Exception e){

         }
        System.out.println("Cybertek");

        try{
            Thread.sleep(3000);

        }catch(Exception e){

        }
        System.out.println("Java");

        try{
            Thread.sleep(4000);

        }catch(Exception e){

        }
        System.out.println("Completed");
    }

}
