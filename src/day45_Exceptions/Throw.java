package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Throw {
    public static void main(String[] args) {

        NoSuchElementException obj = new NoSuchElementException();
        //throw obj;
        //throw new NoSuchElementException();

       /* boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It's break time");
        }*/


        try {
            throw new IOException();
        } catch (Exception e) {

        }

    }
}
