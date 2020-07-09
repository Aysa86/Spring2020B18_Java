package day41_Inheritance;

public class Fish extends Animal{
    public void swim(){
        System.out.println(name+" is swimming");
    }
    public static void main(String[] args) {



        Fish fish1 = new Fish();
        fish1.name = "Color";
        fish1.weight = 0.003;
        fish1.size = "extra small";
        System.out.println(fish1.size);
        System.out.println(fish1.name);
        System.out.println(fish1.weight);

        fish1.eat();
        fish1.move();
        fish1.swim();



    }
}
