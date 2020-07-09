package Tasks.Abstract_Pets;

public abstract class Pets {
    /*
    1. create an abstract class called Pets
                attributes: name, age, color, breed, gender
                methods:
                    abstract methods: sleep, eat, speak
                    instance method: toString
        2. create three sub classes (non-abstract) of pet:
                                1. Dog
                                2. Cat
                                3. Tiger
                each class MUST have constructors to initialize the attributes
     */

    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public String toString(){
        return "Name: "+name+", age: "+age+", color: "+color+", breed: "+breed+", gender: "+gender;
    }




}
