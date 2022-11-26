package SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){

        Message message = new Message(u1,u2,text);

        message.sender=u1;
        message.receiver=u2;
        message.text=text;

        messages.add(message);
    }

    public static List<Message> getMessages(){
        return messages;

    }

    public static void showDialog(User u1, User u2){

        for(Message s:getMessages()){
            if(s.getSender()==u1&&s.getReceiver()==u2){
                System.out.println("User 1: "+'\n' + s);
            }
            if(s.getSender()==u2&&s.getReceiver()==u1){
                System.out.println("User 2: "+'\n' + s);
            }
//    for(int i=0;i<messages.toArray().length;i++){
//        if(i==0&&i%2==0) {
//            System.out.println("User 1: " + messages.get(i));
//        }else{
//            System.out.println("User 2: " + messages.get(i));
//        }
    }

    }

}
