package day21_multyDimentionalArrays;

public class Emails {
    public static void main(String[] args) {
        /*
        Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};


        /*for(String eachEmail : emails) {


            if (!eachEmail.endsWith("@gmail.com")) {             FIRST SOLUTION
                System.out.println(eachEmail);*/


        for(String eachEmail : emails) {
            if (eachEmail.endsWith("@gmail.com")) {
                continue;
                                                        //       SECOND SOLUTION
            }
            System.out.println(eachEmail);
        }
















        }
}
