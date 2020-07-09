package Tasks;

public class ParseValueOfMethods {
    public static void main(String[] args) {

        String str = "FALSe";
       boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
       Boolean  b1 = Boolean.valueOf(str);
        System.out.println(b1);


        String str1 = "1000000000.5";
        float f1 =Float.parseFloat(str1);
        System.out.println(f1);
        Float f2 = Float.valueOf(str1);
        System.out.println(f2);

        String str2 = "123456";
        int i1 = Integer.parseInt(str2);
        System.out.println(i1);
        Integer i2 = Integer.valueOf(str2);
        System.out.println(i2);
    }
}
