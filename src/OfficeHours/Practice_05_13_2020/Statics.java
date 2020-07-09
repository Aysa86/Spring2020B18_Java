package OfficeHours.Practice_05_13_2020;

public class Statics {

    int instanceVariable = 100;
    static int staticVariable = 200;
    public static void StaticMethod(){

        //InstanceMethod();                         STATIC DOESN'T EXCEPTS INSTANCES
       // System.out.println(instanceVariable);

        System.out.println(staticVariable);


    }
    public void InstanceMethod(){
        StaticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }


    public static void main(String[] args) {
        //System.out.println(instanceVariable); can't call instance in the main method directly
        System.out.println(staticVariable);

    }

}
