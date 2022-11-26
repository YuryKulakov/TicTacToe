package SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    List<User> subscriptions;
    boolean checkSub;
    boolean checkSub1;
    boolean checkReciprocity;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {

        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {

        for (User us : this.subscriptions) {
            checkSub = this.subscriptions.contains(user);
        }
        return checkSub;
    }

    public boolean isFriend(User user) {

        for (User us : this.subscriptions) {
            checkSub = this.subscriptions.contains(user);
        }
        for (User us1 : user.subscriptions) {
            checkSub1 = user.subscriptions.contains(this.getUserName());
        }
        if (checkSub == true && checkSub1 == true) {
            checkReciprocity = true;
        } else {
            checkReciprocity = false;
        }
        return checkReciprocity;
    }

    public void sendMessage(User user, String text){

        MessageDataBase.addNewMessage(this,user,text);

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return userName;
    }
}
