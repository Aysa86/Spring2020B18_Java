package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userInputGmail);// false

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("=============================================================");

        /*
        every website has "www." at the beginning of the  web address
         */

        String webAddress = "www.amazon.com";
        if(webAddress.startsWith("www.")){
            System.out.println("valid website");
        }

        System.out.println("===============================================================");


        String email = "CybertekSchool@yahoo.com";

        if(email.endsWith("gmail.com")){
            System.out.println("Valid Gmail");
        }else{
            System.out.println("Invalid Gmail");
        }



    }
}
