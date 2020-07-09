package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {

        String food1 = "Chicken";
        String food2 = "Fish";

        String drink1 = "Milk";
        String drink2 = "Water";

        String toy1 = "small ball";
        String toy2 = "me";

        String subject1 = "Java";
        String subject2 = "Soft skills";

        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Medium", 2, "Grey","Fluffy");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "big", 1, "Brown", "Ghost");

        dog1.eating(food1);//Fluffy is eating Chicken
        dog2.eating(food2);//Ghost is eating Fish

        dog2.drinking(drink1);//Ghost is drinking Milk
        dog1.drinking(drink2);//Fluffy is drinking Water

        dog1.playing(toy2);//Fluffy is playing with me
        dog2.playing(toy1);//Ghost is playing with small ball

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "small", 4, "white", "Lucky");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Husky", "Extra big", 6, "white", "Bella");

        System.out.println("============================================================");

        Dog [] dogPark = {dog1, dog2, dog3, dog4};

        for(int i = 0; i < dogPark.length; i++){
            dogPark[i].eating(food1); // "Chicken" ==> the same result
        }

        for(Dog eachDog : dogPark){
            eachDog.drinking(drink1); // "milk"==> the same result
        }

        for(int i = 0; i < dogPark.length; i++){
            dogPark[i].playing("football");
        }
        for(Dog eachDog : dogPark){
            eachDog.studying(subject1);
        }

    }

}
