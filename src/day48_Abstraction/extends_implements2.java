package day48_Abstraction;

interface P{
void method1();
}

interface Q extends P{
int method2();
}

abstract class R{
abstract void method3();
}

public class extends_implements2 extends R implements P, Q{

    // class extends class and then we can implement interfaces
    public static void main(String[] args) {
      //  R obj = new R(); abstract, not concrete, we can't create an object
      //  Q obj = new Q(); interface, not a class,we can't have constructor in interface, not concrete
    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }

}
