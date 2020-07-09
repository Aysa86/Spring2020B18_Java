package day37_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "X5", 2020, 50000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);


        Car car2 = new Car("Toyota", "Corolla", 2020, 30000);
        System.out.println(car2);



    }
}
