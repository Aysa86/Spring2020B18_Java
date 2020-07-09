package Replit;

public class MethodsReturn_162 {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if(a && b || c){
            return true;
        }else{
            return false;
        }


    }//end threeLocks

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
      boolean result =   threeLocks(true,false, true);
        System.out.println(result);

    }
}


