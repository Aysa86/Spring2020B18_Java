package day06_Shortland_LogicalOperators;

public class IfStatementsPractice {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        if(a > b){

            System.out.println(a + " is greater than" + b); //false, its not gonna be printed;

        }

        if(b > a){
            System.out.println(b + " greater than " + a); //true, print
        }

        if(a == b){
            System.out.println(a + " is equal" +b );
        }


        int x = 200;int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;

        if(xGreater){
            System.out.println(x+ " is greater than " + y);

        }

        if(yGreater){
            System.out.println(y + " is greater than" + x);
        }
        if(xGreater == yGreater) {
            System.out.println(x + " is equal to " +y);


        }
    }
}
