package Tasks.Edible;

public class Burger implements Edible{
    /*
    3. create an class named Burger that can inherit from Edible
            variables: name, size
            method: toString();
            create a constructor that can initialize instance variables
     */
    public String name;
    public String size;

    public String toString(){
        return "Name: "+name+", size: "+size;
    }
    public Burger(String name, String size){
        this.name = name;
        this.size = size;
    }
    @Override
    public void eat(){
        System.out.println("Burger is edible");
    }

}
