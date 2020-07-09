package day43_MethodOverriding;

class Test{

    public void method(){
        System.out.println("Aysa");
    }


}

public class MethodOverriding extends Test{

     @Override // check if the method overridden or not

    public void method(){
        System.out.println("Zarina");
    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.method(); // Aysa

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method(); // Zarina

    }






}
