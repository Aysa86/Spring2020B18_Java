package Tasks.SocialMedia;

public class User {
    public static void main(String[] args) {

        FaceBookUser user = new FaceBookUser("java5", "aysa");
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());

        FaceBookUser user2 = new FaceBookUser("jamesB", "pass007", "James Bond");
        System.out.println(user2.getUserName());
        System.out.println(user2.personalURL);
        System.out.println(user2.accountLength);
        System.out.println(user2.getFullName());

    }
}
