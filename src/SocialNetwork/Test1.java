package SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
       User us1 = new User("Ivan");
        User us2 = new User("Kira");
        User us3 = new User("Andrey");

        us1.sendMessage(us2,"Hi!");
        Thread.sleep(10000);
        us2.sendMessage(us1,"Hello!");

//        MessageDataBase.addNewMessage(us1,us2,"Hi!");
//     MessageDataBase.addNewMessage(us2,us1,"Hello.");
//        MessageDataBase.addNewMessage(us1,us2,"How are u?");
//        MessageDataBase.addNewMessage(us2,us1,"i'm fine");
//        MessageDataBase.addNewMessage(us2,us1,"And u?");
//        MessageDataBase.addNewMessage(us3,us1,"1 one");
//        MessageDataBase.addNewMessage(us3,us1,"2 two");
//        MessageDataBase.addNewMessage(us3,us1,"3 three");
//        MessageDataBase.addNewMessage(us1,us3,"WoW");
//        MessageDataBase.addNewMessage(us1,us3,"OwO");
//        MessageDataBase.addNewMessage(us1,us3,"H");
//        MessageDataBase.addNewMessage(us3,us1,"4 three");

        MessageDataBase.showDialog(us1,us2);

    }
}
