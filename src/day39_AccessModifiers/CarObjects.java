package day39_AccessModifiers;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("Toyota", "Corolla");
        System.out.println(car2);

        Car car3 = new Car("Audi", "TT", 2018);
        System.out.println(car3);

        Car car4 = new Car("Nissan", "Quest", 2010, 1000);
        System.out.println(car4);


    }
}
