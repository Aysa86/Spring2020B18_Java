package day40_Encapsulation;

public class Credentials_Object {

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("adzhalaeva@gmail.com");
        System.out.println(facebook.getUserName());

        facebook.setPassWord("4321");
        System.out.println(facebook.getPassWord());

    }
}
