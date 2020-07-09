package OfficeHours.Practice_03_25_2020;

public class ExplicitCasting {


    public static void main(String[] args) {

        byte bnum = 100;

        short snum = bnum;//implicit casting done automaticly smaller primitive types can ALWAYS be assigned to larger one;

        int inum = 200;
        short sNum = (short)inum; // explicit casting;

        float fNum = (float)0.5;
        System.out.println((fNum)); //0.5;
        float fNum2 = (long)0.5;
        System.out.println(fNum2);//0.0;

        long lNum1 = (long)4.5;// long, int, short,byte==>whole numbers
        System.out.println(lNum1); //4;
        //4.5
        System.out.println(9/2);//4
        System.out.println(9/(float)2); //4.5;



int score =0;
if(score==0){
    score+=50;
    if(score!=0){
        score+=50;
        System.out.println(score);
    }
}







    }
}
