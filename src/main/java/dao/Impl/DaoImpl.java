package dao.Impl;

import dao.BaseService;
import dao.IDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import pojo.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fujie on 20/6/28.
 */
public class DaoImpl extends BaseService implements IDao {
    private Logger logger = Logger.getLogger(DaoImpl.class);

    @Override
    public void select(Map<String, Object> params) throws IOException {
        logger.info("【select方法】");
        SqlSession session = getBaseDao();
        List<User> user = session.selectList("select", params);
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

    public void insert(List params) throws IOException {
        logger.info("【insert方法】");
        SqlSession session = getBaseDao();
        session.insert("insertUser", params);
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

    @Override
    public void getCount() throws IOException {
        logger.info("【getCount方法】");
        SqlSession session = getBaseDao();
        int count = session.selectOne("count");
        System.out.println("【getCount】:count = " + count);
    }

    @Override
    public void getOne(Map<String, Object> params) throws IOException {
        logger.info("【getOne方法】");
        //只能根据主键查询
        SqlSession session = getBaseDao();
        User user = session.selectOne("select", params);
        System.out.println(user);

    }

    @Override
    public void listAll(List<User> cs) {
        logger.info("【listAll方法】");
//        List<User> cs = session.selectList("select");
        for (User c : cs) {
            System.out.println(c);
        }
//        for(HashMap<> hs:cs){
//
//        }
    }

}

