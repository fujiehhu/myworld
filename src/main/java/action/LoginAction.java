package action;

import dao.Impl.LoginImpl;
import org.apache.log4j.Logger;
import pojo.Login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 20/7/11.
 */
public class LoginAction {
    private Logger logger = Logger.getLogger(LoginAction.class);
    private Login login;

    public String checkusername() throws IOException {
        logger.info("【checkusername方法】");
        String usrname = login.getNAME();
        String usrpwd = login.getPWD();

        Map<String, Object> params = new HashMap<>();
        LoginImpl dao = new LoginImpl();
        params.put("NAME", usrname);
        params.put("PWD", usrpwd);
        int res = dao.checkUser(params); // 1 存在 0 不存在

//        String flag = login.getFlag();
//        if (flag.equals("2")) {
//            logger.info("【checkusername方法】-- 注册");
//            return "login_register";
//        } else {

        if (res == 1) {
            logger.info("【checkusername方法】-- 验证成功");
            // 验证成功
            System.out.println("login.name:" + login.getNAME() + "   login.pwd:" + login.getPWD());
            return "login_success";
        } else {
            logger.info("【checkusername方法】-- 验证失败");
            return "login_error";
        }
    }


    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
