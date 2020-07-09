package day48_Abstraction;
abstract class T{
  //  public default void method2(){} it can be created only in interface
}
public interface defaultMethod {

    default void method(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {
     N obj = new N();
     obj.method();
    }

    class N implements defaultMethod{

    }



}
