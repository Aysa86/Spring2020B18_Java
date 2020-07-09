package day41_Inheritance;


import day41_Inheritance.Data; // if we import data from other class, we can't use it, not compile. we have to
                //  extend it in order to use data
public class TestData extends Data{
    public static void main(String[] args) {

        /*System.out.println(Data.a);
        Data.method1();
         */
        System.out.println(TestData.a);
        TestData.method1();

    }

}
