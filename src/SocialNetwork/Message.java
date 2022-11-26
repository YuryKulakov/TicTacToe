package SocialNetwork;

import java.util.Date;

public class Message {
    User sender;
    User receiver;
    String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return
                "FROM: " + sender + '\n'+
                "TO: " + receiver +'\n'+
                "ON: " + date + '\n' +
                "TEXT: " + text + '\n'+
                "____________________________________________________________";
    }
}
