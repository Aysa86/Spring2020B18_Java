package day54_Maps;

public class GarbageCollector {
    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector(); // will not be collected by Garbage Collector
        new GarbageCollector(); // no assigning to variable, not reusable,  will be collected by Garbage Collector

        System.out.println("Done");

        // unreference an object:

        String str = new String("Cybertek");// will be collected by Garbage Collector
               str = new String("MIT"); // reassigning

        System.out.println(str); // MIT

        Integer num = new Integer(123);
                num = new Integer(456);

        System.out.println(num); // 456


        Double n = new Double(0.5);
               n = null; // null means nothing, non
        System.out.println(n);// null













    }
}
