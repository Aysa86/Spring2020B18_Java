package day50_polymorphism;
// final bc I don't want to override Dog class, it will not have sub classes
public final class Dog extends Animal{ // 3 variables, 3 methods
    /*
     3. create subclass of Animal named Dog
            variable: dogName
            methods: bark*/

    public String dogName;
    public Dog(String dogName, int age, char gender){
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }
    public void bark(){
        System.out.println(dogName+" is barking");
    }
    @Override
    public void eat(){
        System.out.println(dogName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println(dogName+" is sleeping");
    }

    public static void methodA(int a){
        System.out.println("Dog class A");
    }
}
