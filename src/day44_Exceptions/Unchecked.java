package day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {

     /*  // System.out.println( 9 / 0 );Exception in thread "main" java.lang.ArithmeticException: / by zero
	                                  at day44_Exceptions.Unchecked.main(Unchecked.java:6)
                                                                                             */

        System.out.println("Test completed");// it's not gonna be printed, because we have EXCEPTION ( 9 / 0 )


        String str = "Cybertek";
        //System.out.println(str.charAt(-1)); //StringIndexOutOfBoundsException: String index out of range: -1

        int[] arr = {1,2,3};
       // System.out.println(arr[200]);     java.lang.ArrayIndexOutOfBoundsException: 200





    }
}
