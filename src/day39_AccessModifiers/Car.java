package day39_AccessModifiers;

public class Car {

    /*
    1. create a class called Car:
                instance variable:
                        brand, model, year, price
                add a constructor that can initialize brand of car
                add a constructor that can initialize brand and model of the car
                                (apply constructor call to initalize the brand)
                add a constructor that can initialize the brand, model, year of the car
                                (apply constructor call to initialize brand, model)
                add a constructor that can initialize brand, model, year and price of the car
                                (apply constructor call to initialize brand, model, year)
                add toString method

     */

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String model){
       // this.brand = brand;
        this(brand); // CONSTRUCTOR CALL, it has to be on the very first place
        this.model = model;
    }

    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price = price;
    }

    public String toString(){
        return "Brand: "+brand+", model: "+model+", year: "+year+", price: "+price;
    }


}