package day50_polymorphism;

public final class Cat extends Animal{ // don't have error, in Animal class methods have body
    /*
     2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
     */
    public Cat(String catName, int age, char gender){
        this.catName = catName;
        this.age = age;        // constructor
        this.gender = gender;
    }
    public String catName; //I have 3 variables, 3 instance methods

    public void scratch(){
        System.out.println(catName+" is scratching the sofa");
    }
    @Override
    public void eat(){
        System.out.println(catName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println(catName+" is sleeping");
    }
}
