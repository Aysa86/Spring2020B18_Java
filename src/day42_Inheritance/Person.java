package day42_Inheritance;

public class Person {
    /*
    create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo


		create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */

    public String name;
    public int age;
    public char gender;

    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }
    public void walk(){
        System.out.println(name+" went for a walk");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void setPersonInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }




}
