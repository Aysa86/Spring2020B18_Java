package OfficeHours.Practice_05_20_2020;

public class Cat extends Pet {
    /*
    Cat:
        variables:  name, age, color, size, breed, isPet, numberOfeyes
        methods: eat, sleep, drink, toString, scratch, setInfo
     */

    public void scratch(String thing){
        System.out.println(name+" is scratching "+thing);
    }
    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }


}
