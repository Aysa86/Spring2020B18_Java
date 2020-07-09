package day46_final_abstract;

public class final_practices {

    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
       // a = 20; final can not be reassigned
    }

    static {
        System.out.println(b);
      //  b = 30; final can not be reassigned
    }

    public final_practices(){ // Constructor can not be final

    }

     final void method1(){ // instance can be final, can not be overridden

    }

    public final static void method2(){ // static can be final, can not be overridden

    }

    private int method1(int a){ // final methods can be overloaded
        return 10;
    }

    public final static void method2(int a){

    } // static final methods can be overloaded
}
  final class test extends final_practices{
    // more visible
   /* protected void method1(){   can not be overridden

    }*/



   }

  /* class test2 extends test{

   }

   */