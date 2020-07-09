package day45_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Summary {
    public static void main(String[] args)  {
         IOException p = new IOException();


        try {
            throw new IOException(); // checked
        } catch (IOException e) {

        }

        System.out.println("Hello");

    try {
    throw new ArrayIndexOutOfBoundsException();
       } catch (Exception e){

       }
        System.out.println("Completed");


     try{
         throw new NullPointerException();
     }catch (ArithmeticException e){
         System.out.println("Arithmetic exception");
     }catch (ClassCastException e){
         System.out.println("Class Cast exception");
     }catch (NullPointerException e){
         System.out.println("Null Pointer exception");
     }catch (RuntimeException e){
         System.out.println("Run time exception");
     }catch (Exception e){
         System.out.println("Exception");
     }finally {
         System.out.println("Finally block");
     }
        System.out.println("================================================");

     try {
         throw new ArithmeticException();

     }catch (NoSuchElementException e){
         System.out.println("No such element");
     }finally {
         System.out.println("Finally block");
     }

        System.out.println("==================================================");




    }

    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void method2(){
        try {
            method1();
        } catch (FileNotFoundException e) {

        }
    }

    public static void method3(){
        method2();
       
    }



}
