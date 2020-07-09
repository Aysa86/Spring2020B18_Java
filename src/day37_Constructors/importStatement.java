package day37_Constructors;

import java.util.Arrays; // only imports Array class
//import java.util.*;// imports every single classes from package java.util
//import static day37_Constructors.Data.staticMethod;
//import static day37_Constructors.Data.staticVariable;
import static day37_Constructors.Data.*;
public class importStatement {
    public static void main(String[] args) {

        int [] arr = {9,4,6,2};
        Arrays.sort(arr);

        System.out.println(staticVariable);
        staticMethod();
    }
}
