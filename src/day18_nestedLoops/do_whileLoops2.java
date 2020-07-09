package day18_nestedLoops;

public class do_whileLoops2 {
    public static void main(String[] args) {

        int number = 103;// print the numbers between 100 ~ number

        while(number>=100){// if false prints nothing
            System.out.println(number);
            number--;
        }

        System.out.println("====================================");
           int number2 = 103;

         do{
             System.out.println(number2);//if false prints one time; 103
             number2--;

         }while(number2>=100);

    }
}
