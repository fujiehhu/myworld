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
public class DaoImpl implements IDao {
    @Override
    public void select() {
        //定义读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;
        try {
            //读取mybatis-config.xml文件到reader对象中
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //初始化mybatis,创建SqlSessionFactory类的实例
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        //创建session实例
        SqlSession session = sqlMapper.openSession();
        //传入参数查询，返回结果
        List<User> user= session.selectList("select");
        //输出结果
        for(User u:user){
            System.out.println(u);
        }
//        System.out.println(user.getNAME());
        //关闭session
        session.close();
    }
    public static void main(String[] args) throws IOException {
        DaoImpl dao = new DaoImpl();
        dao.select();
    }
}

