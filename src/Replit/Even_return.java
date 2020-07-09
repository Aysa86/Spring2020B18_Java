package Replit;

public class Even_return {
    public static boolean isEven(int n){

        if(n % 2 == 0){
            System.out.println("true");
        return true;
        }else{
            System.out.println("false");
        }
        return false;
    }

    public static void main(String[] args) {
        isEven(9);
        isEven(2);
    }
}
