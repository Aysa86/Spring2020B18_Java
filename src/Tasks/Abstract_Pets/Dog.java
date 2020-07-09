package Tasks.Abstract_Pets;

public class Dog extends Pets{
    /*
    2. create three sub classes (non-abstract) of pet:
                                1. Dog
                                2. Cat
                                3. Tiger
                each class MUST have constructors to initialize the attributes
     */

    public Dog(String name, int age, String color, String breed, char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void speak(){
        System.out.println(name+" is speaking");
    }

}
