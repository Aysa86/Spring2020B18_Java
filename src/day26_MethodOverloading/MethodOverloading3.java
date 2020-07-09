package day26_MethodOverloading;

public class MethodOverloading3 {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
*/
    public static void main(String[] args) {
        // 60,40
        sum(60, 40);
        //5.5, 8.5
        sum(5.5, 8.5);
        // 10, 15.5
        sum(10,15.5); // takes as a double. double is larger, we can be assigned to double
        //25L, 30L
        sum(10L, 30L);// takes as a double
        // 8L, 40L
        sum((int)8L, (int)40L);

    }



    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(double a, double b){
        System.out.println(a+b);
    }





}
