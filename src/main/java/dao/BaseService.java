package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by lenovo on 20/6/29.
 */
public class BaseService {
    //定义读取文件名
    private String resources = "mybatis-config.xml";
    private SqlSessionFactory sqlSessionFactory;
    //创建流
    private Reader reader = null;
    private SqlSession session;

    public SqlSession getBaseDao() throws IOException {
        try {
            //读取mybatis-config.xml文件到reader对象中
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //初始化mybatis,创建SqlSessionFactory类的实例
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建session实例
        session = sqlSessionFactory.openSession(true); //自动提交
        return session;
    }

}
