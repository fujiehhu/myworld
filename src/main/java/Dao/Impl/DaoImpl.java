package Dao.Impl;

import Dao.BaseService;
import Dao.IDao;
import org.apache.ibatis.session.SqlSession;
import pojo.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 20/6/28.
 */
public class DaoImpl extends BaseService implements IDao {

    @Override
    public void select(Map<String, Object> params) throws IOException {
        SqlSession session = getBaseDao();
        //传入参数查询，返回结果
        List<User> user = session.selectList("select", params);
        //输出结果
        listAll(session);
        session.close();
    }

    @Override
    public void insert(Map<String, Object> params) throws IOException {
        SqlSession session = getBaseDao();
        session.insert("insert", params);
        listAll(session);
        session.close();
    }

    @Override
    public void delete(Map<String, Object> params) throws IOException {
        SqlSession session = getBaseDao();
        session.delete("delete", params);
        listAll(session);
        session.close();
    }

    @Override
    public void update(Map<String, Object> params) throws IOException {
        SqlSession session = getBaseDao();
        session.update("update", params);
        listAll(session);
        session.close();
    }

    public void getCount() throws IOException {
        SqlSession session = getBaseDao();
        int count = session.insert("count");
        System.out.println(count);
    }

    public void getOne() throws IOException {
        //只能根据主键查询
        SqlSession session = getBaseDao();
        User user1 = new User();
        user1.setId("003");
//        user1.setNAME("jiejiessas");
        User user = session.selectOne("select", user1);
        System.out.println(user);

    }

    private void listAll(SqlSession session) {
        List<User> cs = session.selectList("select");
        for (User c : cs) {
            System.out.println(c);
        }
    }


}

