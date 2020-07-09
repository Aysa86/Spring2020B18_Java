package day18_nestedLoops;

public class do_whileLoopPractice {
    public static void main(String[] args) {
        /*
        print all the even numbers  0~100 in the same line separated by the space
         */

        int num = 0;

        do{
          if(num % 2 ==0){// (num % 2 != 0) for odd numbers
              System.out.print(num+" ");
          }
            num++;
        }while (num <= 100);

        System.out.println();

        int i = 1;

        do{
            // i++  it starts to print from 2,
            System.out.println(i);
            i++;// iterator has to be after print statement, Java from top to bottom
        }while(i<=5);

        System.out.println("======================================");
        int z = 1;
        do{
            System.out.println(z);
            if(z ==3){
                break; // if i want to print from 1 to 3, I'll use break
            }


            z++;
        }while(z <= 5);

        System.out.println("=======================================");

        int y = 1;
        do{
            if(y == 3){
                y++;// we have to give it to continue execution; after 3 was skipped
                continue;// skips 3, doesnt print 3
            }

            System.out.println(y);
            y++;
        }while(y<=5);

        System.out.println("===========================================");

        int t = 1;

        do{

            if(t % 2 != 0){// skips all odd numbers
                t++;// to make sure that iterator is not skips,if iterator is skipping its gonna continue to execute infinite times
                continue;
            }

            System.out.print(t+" ");
            t++;
        }while (t<=100);





    }
}
