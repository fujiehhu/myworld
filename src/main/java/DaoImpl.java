import pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
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
        user.setID("1000");
        user.setNAME("jiejie");
        user.setAGE("11");
        user.setSEX("dd");
        SqlSession session = getBaseDao();
        session.insert("insert",user);
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

    public static void main(String[] args) throws IOException {
        DaoImpl dao = new DaoImpl();
        dao.insert();
        dao.select();
    }
}

