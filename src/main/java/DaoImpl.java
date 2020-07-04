import Dao.BaseService;
import Dao.IDao;
import pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 20/6/28.
 */
public class DaoImpl extends BaseService implements IDao {

    @Override
    public void select() throws IOException {
        SqlSession session = getBaseDao();
        //传入参数查询，返回结果
        List<User> user = session.selectList("select");
        //输出结果
        for (User u : user) {
            System.out.println(u);
        }
        //关闭session
        session.close();
    }

    @Override
    public void insert() throws IOException {
        User user = new User();
        user.setID("10009990");
        user.setNAME("jiejie");
        user.setAGE("11");
        user.setSEX("dd");
//        System.out.println(user);
        SqlSession session = getBaseDao();
        session.insert("insert", user);
//        需要手动提交
        session.commit();
        listAll(session);
        //关闭session
        session.close();
    }

    @Override
    public void delete() throws IOException {
        SqlSession session = getBaseDao();
    }

    @Override
    public void update() throws IOException {
        SqlSession session = getBaseDao();
    }

    public void getCount() throws IOException {
        SqlSession session = getBaseDao();
        int count = session.selectOne("count");
        System.out.println(count);
    }

    private static void listAll(SqlSession session) {
        List<User> cs = session.selectList("select");
        for (User c : cs) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) throws IOException {
        DaoImpl dao = new DaoImpl();
//        dao.getCount();
        dao.insert();
//        dao.select();
    }
}

