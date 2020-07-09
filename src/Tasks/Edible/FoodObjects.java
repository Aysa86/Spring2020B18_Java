package Tasks.Edible;

public class FoodObjects {
    public static void main(String[] args) {

        IceCoffee coffee = new IceCoffee("Large");
        System.out.println(coffee);
        coffee.drink();
        coffee.eat();


        Burger burger = new Burger("Cheeseburger", "small");
        System.out.println(burger);
        burger.eat();
    }
}
