package day26_MethodOverloading;

public class MethodOverloading4 {
    public static void main(String[] args) {
        System.out.println("String");// this "String" will be printed, compiler knows it as a main method
    }

    public static void main(double[] args) {
        System.out.println("Double");
    }

    public static void main(int[] args) {
        System.out.println("Int");
    }







}
