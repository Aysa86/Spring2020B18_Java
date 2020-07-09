package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {
//                             0    1       0    1    2       0    1    2     3
       char [][] arr2D =  {  {'A', 'B' }, {'C', 'D', 'E' }, {'F', 'J', 'H' , 'I'}  };
        //                         0             1                  2
       // each index in arr2D MUST BE single dimensional array

        // arr2D [0] ==> {'A', 'B' }

        for(int i = 0; i < arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);
        }
       // arr2D[1] ==> {'C', 'D', 'E'}

        for(int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);


            // arr2D[2] ==> {'F', 'J', 'H' , 'I'}

            for (int a = 0; a < arr2D[2].length; a++) {
                System.out.println(arr2D[2][a]);
            }

            System.out.println("===================================");

            for (int j = 0; j < arr2D.length; j++) {// index number of single dimensional array

                for (int a = 0; a < arr2D[j].length; a++) {//index number of elements in single array
                    System.out.println(arr2D[j][a]);
                }


            }

        }


    }
}
