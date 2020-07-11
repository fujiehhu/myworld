package action;

import pojo.User;

/**
 * Created by lenovo on 20/7/8.
 */
public class UserAction {
    private User user;

    public String show() {
        user = new User();
        user.setName("iphone7");
        System.out.println(user);
        return "show";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
