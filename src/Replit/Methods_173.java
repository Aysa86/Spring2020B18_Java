package Replit;

public class Methods_173 {
    public static String biggerS(String a ,String b)
    {
        int length1 = a.length()-1;
        int length2 = b.length()-1;
        if(length1>length2){
            return a;
        }else{
            return b;
        }
    }
}
