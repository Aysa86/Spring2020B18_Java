package day45_Exceptions;

public class WarmUp {
    public static void main(String[] args) {

        int pushUp = 1;
        while (pushUp < 20){
            System.out.println("Push up " + pushUp);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
            pushUp++;
        }



    }

}
