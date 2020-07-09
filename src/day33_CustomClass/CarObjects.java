package day33_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
      Car car1 = new Car(); // object of the car
        car1.Brand = "BMW";
        car1.model = "X5";
        car1.year = 2020;
        car1.color = "red";


        System.out.println(car1.Brand);// instance variables are object variables, we can call them through the object name
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.StartAction();
        car1.drive();
        car1.info();

        System.out.println("========================================================");

        Car car2 = new Car();

        car2.Brand = "Toyota";
        car2.model = "Corolla";
        car2.year = 2019;
        car2.color = "Black";

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.StartAction();
        car2.drive();
        car2.info();

        System.out.println("===============================================================");

        Car car3 = new Car();

        car3.Brand = "Audi";
        car3.model = "TT";
        car3.year = 2019;
        car3.color = "White";

        car3.info();
        car3.StartAction();
        car3.drive();

        System.out.println("==========================================================");

        Car [] cars = {car1, car2, car3};

        cars[0].info();
        cars[1].info();
        cars[2].info();



    }
}
