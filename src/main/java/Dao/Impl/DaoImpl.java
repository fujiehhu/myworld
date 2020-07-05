package Dao.Impl;

import Dao.BaseService;
import Dao.IDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import pojo.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 20/6/28.
 */
public class DaoImpl extends BaseService implements IDao {
    private Logger logger = Logger.getLogger(DaoImpl.class);

    @Override
    public void select(Map<String, Object> params) throws IOException {
        logger.info("【select方法】");
        SqlSession session = getBaseDao();
        //传入参数查询，返回结果
        List<User> user = session.selectList("select", params);
        //输出结果
        listAll(user);
        session.close();
    }

    @Override
    public void insert(Map<String, Object> params) throws IOException {
        logger.info("【insert方法】");
        SqlSession session = getBaseDao();
        session.insert("insert", params);
//        listAll(session);
        session.close();
    }

    @Override
    public void delete(Map<String, Object> params) throws IOException {
        logger.info("【delete方法】");
        SqlSession session = getBaseDao();
        session.delete("delete", params);
//        listAll(session);
        session.close();
    }

    @Override
    public void update(Map<String, Object> params) throws IOException {
        logger.info("【update方法】");
        SqlSession session = getBaseDao();
        session.update("update", params);
//        listAll(session);
        session.close();
    }

    public void getCount() throws IOException {
        logger.info("【getCount方法】");
        SqlSession session = getBaseDao();
        int count = session.selectOne("count");
        logger.info("【getCount】:count = " + count);
    }

    public void getOne() throws IOException {
        logger.info("【getOne方法】");
        //只能根据主键查询
        SqlSession session = getBaseDao();
        User user1 = new User();
        user1.setId("003");
        User user = session.selectOne("select", user1);
        System.out.println(user);

    }

    private void listAll(List<User> cs) {
        logger.info("【listAll方法】");
//        List<User> cs = session.selectList("select");
        for (User c : cs) {
            System.out.println(c);
        }
    }

}

