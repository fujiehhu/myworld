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
        return "show";
    }

    public User getProduct() {
        return user;
    }

    public void setProduct(User user) {
        this.user = user;
    }
}
