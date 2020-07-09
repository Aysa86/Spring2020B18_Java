package day33_CustomClass;

public class Cat {

    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(String catFood){
        System.out.println(name+" is eating "+ catFood);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void setCatInfo(String CatBreed, String CatColor, int CatAge, String CatName){
        breed = CatBreed;
        color = CatColor;
        age = CatAge;
        name = CatName;
    }
    public String toString(){
        String result = name+", "+"breed is "+ breed+", the color is "+ color+", "+age+" years old";
        return result;
    }






}
