package Tasks.Edible;

public class IceCoffee implements Drinkable{
    /*
    4. create another class called IceCoffee  that can inherit from Drinkable
                variable: size
                method: toString()
            create constructor that can set the size
    fix any error might come up
     */
    public String size;

    public String toString(){
      return   "Size is: "+size;
    }
    public IceCoffee(String size){
        this.size = size;
    }
    @Override
    public void drink(){
        System.out.println("I drink ice cofee");
    }
    @Override
    public void eat(){
        System.out.println("I'm eating my burger");
    }
}
