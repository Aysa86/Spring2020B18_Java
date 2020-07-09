package Tasks.Abstract_Pets;

public class Cat extends Pets {


    public Cat(String name,  int age, String color, String breed, char gender){
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
