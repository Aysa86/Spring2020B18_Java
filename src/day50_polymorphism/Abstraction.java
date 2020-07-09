package day50_polymorphism;
interface I{
    void method2();// public abstract by default
    abstract int method3();
   // public I(){ } no constructor
   // public void m(){} no instance methods
  // {} no instance block
   //static {} no static block
    int a = 1000; // static,can call in static method to check if it's static
                  // and final, to check try to reassign it
    public static void main(String[] args) {
        System.out.println(a);//I called it in static method
    }
}
abstract class A{
    public abstract void method1();// abstract method
    public void method4(){ }// instance method
    public A(){}// constructor
    {

    }
    static {

    }
}

public class Abstraction extends A implements I{

    //public abstract void method1(); I have to declare abstract method either in abstract class or in an interface
    @Override
    public void method1(){ // meant to be overridden from abstract class

    }
    @Override
    public void method2(){

    }                           // meant to be overridden from the interface
    @Override
    public int method3(){
        return 0;
    }
}
