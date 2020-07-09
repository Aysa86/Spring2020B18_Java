package OfficeHours.Practice_03_25_2020;

public class MultiBranch_Practice {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        if (num1 > num2) {

            System.out.println(num1+" is greater than"+num2);
        }else if(num1>num2){
            System.out.println(num2+" is greater than"+num2);
        }else{
            System.out.println(num1+" is equal to"+num2);
        }

        String browserName = "Chrome";
            if(browserName=="Firefox"){
            System.out.println("Firefox browser is opening");
        }else if(browserName =="Chrome"){
            System.out.println("Chrome browser is opening");

        }else if(browserName=="Internet Explore"){
            System.out.println("Internet Explorer browser is opening");
        }else if(browserName=="Safari"){
            System.out.println("Safari browser is opening");
        }else if(browserName=="Opera"){
            System.out.println("Opera browser is opening");
        }else {
            System.out.println("Invalid Browser Name");
        }




    }
}
