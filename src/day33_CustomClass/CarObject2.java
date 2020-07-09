package day33_CustomClass;

public class CarObject2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW", "X6", 2020, "Black");
        car1.info();


        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Corolla", 2020, "Red");
        car2.info();

        Car car3 = new Car();
        car3.setCarInfo("Mercedes", "C Class", 2020, "White");
        car3.info();

        Car car4 = new Car();
        car4.setCarInfo("Honda", "Civic", 2020, "White");
        car4.info();

        Car car5 = new Car();
        car5.setCarInfo("Audi", "TT", 2019, "Silver");
        car5.info();

        System.out.println("=======================================================================");

        Car[] cars = {car1, car2, car3, car4, car5};

        for(int a = 0; a < cars.length; a++){
            cars[a].info();
        }

        System.out.println("=========================================================================");

        for(Car each : cars){
            each.info();
        }

        System.out.println("==========================================================================");

        System.out.println(car1);//2020 BMW X6 Black (toString method)



    }

}
