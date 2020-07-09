package Replit;

public class Car {

    /*
    Include the following class variables:
* make
* model
* numberOfDoors
* topSpeed
* price
All class variables should be declared case sensitive

Write four constructors:
* The main constructor that can initialize all variables
* A secondary constructor that does not include numberOfDoors, which should default to 4
* A secondary constructor that does not include make and model; both default to "unknown"
* A secondary constructor that does not include topSpeed or price; default to 90 and 0 respectively.
     */

    String make = "unknown";
    String model = "unknown";
    int numberOfDoors = 4;
    double price = 0;
    double topSpeed = 90;

    public Car(String make, String model, int numberOfDoors, double price, double topSpeed){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.price = price;
        this.topSpeed = topSpeed;
    }
    public Car(String make, String model, double price, double topSpeed){
        this.make = make;
        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;

    }
    public  Car(double price, double topSpeed, int numberOfDoors){
        this.price = price;
        this.topSpeed = topSpeed;
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String make, String  model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public static void main(String[] args) {
        Car car1 = new Car(20000, 100, 4);
        System.out.println(car1.price);
        System.out.println(car1.topSpeed);
    }

}
