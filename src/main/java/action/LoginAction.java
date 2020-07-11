package action;

import pojo.Login;

/**
 * Created by lenovo on 20/7/11.
 */
public class LoginAction   {
    private Login login;

    public String login() {

        if (true) {
            // 验证成功
            login = new Login();
            login.setNAME("fujie");
            login.setPWD("666");
            return "login_success";
        } else {
            return "login_error";
        }
    }


}
