import Dao.BaseService;
import Dao.IDao;
import Utils.SequenceUtils;
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
        user.setID(SequenceUtils.getSequence(6));
        user.setNAME("jiejie");
        user.setAGE("11");
        user.setSEX("dd");
        SqlSession session = getBaseDao();
        session.insert("insert", user);
        // 需要手动提交
        session.commit();
        listAll(session);
        //关闭session
        session.close();
    }

    @Override
    public void delete() throws IOException {
        SqlSession session = getBaseDao();
        User user = new User();
        user.setID("001");
        session.delete("delete", user);
        // 需要手动提交
        session.commit();
        listAll(session);
    }

    @Override
    public void update() throws IOException {
        SqlSession session = getBaseDao();
        User user = new User();
        user.setID("002");
        user.setNAME("CMOS-中移在线");
        session.update("update", user);
        // 需要手动提交
        session.commit();
        listAll(session);
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
//        dao.insert();
//        dao.delete();
        dao.update();
//        dao.select();
//        System.out.println(SequenceUtils.getSequence(6));
    }
}

