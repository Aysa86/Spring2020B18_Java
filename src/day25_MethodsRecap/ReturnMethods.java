package day25_MethodsRecap;

public class ReturnMethods {

    public static void main(String[] args) {

        max(10,9);
        System.out.println(max(10,9));
        max2(10,9);
        System.out.println(max2(10,9));
    }


    public static int max(int a, int b){

        int max = 0;

        if(a >= b){
            max = a;
        }else{
            max = b;
        }

       return max;
    }


    public static int max2(int a, int b){
        int max = 0;
        if(a >= b){
            return a;
        }else{
            return b;
        }
    }


}
