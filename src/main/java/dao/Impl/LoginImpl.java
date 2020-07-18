package dao.Impl;

import dao.BaseService;
import dao.ILogin;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import pojo.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 20/7/11.
 */
public class LoginImpl extends BaseService implements ILogin {
    private Logger logger = Logger.getLogger(LoginImpl.class);

    public int checkUser(Map<String, Object> params) throws IOException {
        logger.info("【checkUser方法】");
        SqlSession session = getBaseDao();
        int count = session.selectOne("checkUser", params);
        System.out.println(count);
//        listAll(user);
        session.close();
        return count;
    }

    public void listAll(List<User> cs) {
        logger.info("【listAll方法】");
//        List<User> cs = session.selectList("select");
        for (User c : cs) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) throws IOException {
        Map<String, Object> params = new HashMap<>();
        LoginImpl dao = new LoginImpl();
        params.put("NAME", "fujie");
        params.put("PWD", "166");
        dao.checkUser(params);
    }
}
