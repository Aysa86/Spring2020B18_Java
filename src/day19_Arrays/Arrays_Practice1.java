package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String [] myFriendsNames = {"Valentina", "Douglas", "Eugene", "Ekaterina", "Aysa" };
                            // index:    0           1         2           3          4

        String name1 = myFriendsNames [4];
        System.out.println(name1);

        System.out.println(myFriendsNames[2]);

        for(int i = 0; i <= 4; i++){
            String name = myFriendsNames[i];
            System.out.println(name);

        }


        String [] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
        // print out all users who registered with their GMAIL
        for(int i = 0; i <= 3; i++){
            String email = emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }

        }



    }
}
