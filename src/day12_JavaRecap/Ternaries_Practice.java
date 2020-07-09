package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable*/

        System.out.println("Enter status code");
        int statusCode = scan.nextInt();

        String result = "";
        if(statusCode==200){
            result="Ok";
        }else if(statusCode==201){
            result="Created";
        }else if(statusCode==202){
            result = "Accepted";
        }else{
            result="Invalid Status Code";
        }
        System.out.println(result);





        System.out.println("Enter status code");
        int statusCode2 = scan.nextInt();


        String result2 =(statusCode2==200) ? "OK": (statusCode2==201) ? "Created" : (statusCode2==202) ? "Accepted" :
                  "Invalid Status Code";

        System.out.println(result2);
    }
}
