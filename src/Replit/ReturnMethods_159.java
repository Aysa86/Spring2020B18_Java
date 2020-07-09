package Replit;

public class ReturnMethods_159 {
    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        String result="";
        if(buyPrice>sellPrice){
            result="loss";
        }else if(buyPrice<sellPrice){
            result="profit";
        }else{
            result="no loss";
        }
        return result;


    }

    public static void main(String[]args){
        c_profits(100,1500);
    }
}

