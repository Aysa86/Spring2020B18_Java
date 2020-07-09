package day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {

        switch (3){
            case 1:
                System.out.println("Case 1");
                break;//exits switch statement imidiatlly;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Invalid Case");
                break; // not necessary, its the last block
        }


        System.out.println("===================================");
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
503, Service Unavailable

          */
        int statusCode = 202;

        switch (statusCode){
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            default:
                System.out.println("Invalid Status Code");
        }








    }
}
