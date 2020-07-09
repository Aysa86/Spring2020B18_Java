package Tasks.Edible;

public interface Edible {
    /*
    Task01:
    1. create an interface named Edible
            abstract method: eat();
    2. create an interface named Drinkable that can inherit from Edible
            abstract method: drink();
    3. create an class named Burger that can inherit from Edible
            variables: name, size
            method: toString();
            create a constructor that can initialize instance variables
    4. create another class called IceCoffee  that can inherit from Drinkable
                variable: size
                method: toString()
            create constructor that can set the size
    fix any error might come up
     */
    public abstract void eat();
}
