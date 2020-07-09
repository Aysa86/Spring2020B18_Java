package day09_NestedIf_Ternary;

public class AgeGroups_NestedIf {
    /*  teenager (<21)
    adult(>=21 && <55)
    senior(>55)
    age cant be negative or greater than 150;
*/
    public static void main(String[] args) {

        int age = 40;
        String ageGroup = "";


        if(age<150 && age>0) {

            if(age<21){
                ageGroup = "Teenager";
            }else if(age<55){ // age ia already greater or equal to 21;
               ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

            }else{
            ageGroup = "Invalid Entry";
            }

        System.out.println(ageGroup); // Adult;

        System.out.println("=============================================================");

           int age2 = 45;
           String ageGroup2 = "";

           if(age2<150 && age2>0){
             ageGroup2 = (age2 <21) ? "Teenager" : (age2<55) ? "Adult" : "Senior";
           }else{
               ageGroup2 = "Invalid Entry";
           }
        System.out.println(ageGroup2);





    }
}
