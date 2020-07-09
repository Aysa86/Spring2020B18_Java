package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {

        String str = "123";

        int a = Integer.parseInt(str); // 123 as int

        System.out.println(str + 1);// 123 treated as text, to check "+1"
        //                123    1 ==> 1231

        System.out.println(a + 1);// 123 treated as number
        //                123 +1==> 124

      byte b =   Byte.parseByte(str);// 123
        System.out.println(b);

        Integer I1 = (int)Byte.parseByte(str); // converted to int, autoboxing

        String str2 = "10.5";
       float f1 =  Float.parseFloat(str2); // float 10.5
        System.out.println(f1);

        double d1 = Double.parseDouble(str2);
        System.out.println(d1);


        String str3 = "3147483647";
        long l1 = Long.parseLong(str3);//3147483647L
        System.out.println(l1);

       Long L1 =  Long.parseLong(str3); // autoboxing
        System.out.println(L1);



        String result1 = "true"; // if not "true or false" it will return "false"
        boolean bool = Boolean.parseBoolean(result1); //boolean
        System.out.println(bool); // to check if its boolean we give "!" ==> false

        String result2 = "fALsE";// ignore case sensitivity, will return "false"
        boolean bool1 = Boolean.parseBoolean(result2);
        System.out.println(bool1);// false



    }
}
