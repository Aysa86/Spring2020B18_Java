package Tasks.SocialMedia;

public abstract class SocialMedia {
    /*
    Social Media
(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)

     */

    public abstract boolean directMessage(String userName, String message);

    public abstract boolean createPost(String body);

    public abstract void getNotifications(int time);

     String personalURL;
     int accountLength;
     static String Platform;

}
