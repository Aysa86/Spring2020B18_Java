package day50_polymorphism;
  // we cant create an object from Animal, it's abstract, we can create objects from sublasses only
public abstract class Animal { // 2 variables, 2 instance methods
    /*
    Warmup tasks:
    1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark*/

    public int age;
    public char gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){ // it can't be overridden, it will be executed as it is
        System.out.println("Animal Class");
    }
}
