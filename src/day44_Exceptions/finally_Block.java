package day44_Exceptions;

import java.util.NoSuchElementException;

public class finally_Block {
    public static void main(String[] args) {

      try {
          System.out.println( 9 / 0);
          System.out.println("Try block");
      }catch (Exception e){
          System.out.println("Catch block");
      }finally {
          System.out.println("Finally Block"); // finally block always gets executed


      }







    }
}
