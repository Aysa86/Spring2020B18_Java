package day05_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {


        // pre: changes the value of the variable immidietly;
        int a = 100;
        System.out.println(++a); //101;
        System.out.println(a); // 101;

        int b = 100;
        System.out.println(--b); //99;
        System.out.println(b); //99;

        //post: first passes the current value, then eventually increase the variabls' value

        int A = 100;
        System.out.println(A++); //100;
        System.out.println(A); //101;


        int B = 100;
        System.out.println(B--); //100;
        System.out.println(B);     //99;





         }
}
