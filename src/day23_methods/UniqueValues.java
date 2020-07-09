package day23_methods;

public class UniqueValues {
    public static void main(String[] args) {
/*
  warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
        String [] arr = {"A", "B", "A", "C"};

        for(String each : arr) {


            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }

        }











        System.out.println("================================================");
// solution 2



          for(String each2 : arr) {

              int count1 = 0;

              for (String each : arr) {
                  if (each.equals(each2)) {
                      count1++;
                  }
              }
              if (count1 == 1) {// if character is unique
                  System.out.println(each2);
              }

          }








    }
}
