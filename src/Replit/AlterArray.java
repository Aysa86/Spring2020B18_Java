package Replit;

public class AlterArray {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        mystery(a);
        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50
    }
    public static void mystery(int[] array) {

        for(int a = 0; a < array.length; a++){
            if(a % 2 == 0){
             array[a] =    a/2;
            }
            if(a % 2 != 0){
                array[a] = a*10;
            }
        }

    }
}
