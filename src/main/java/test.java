import Dao.Impl.DaoImpl;

import java.io.IOException;

/**
 * Created by lenovo on 20/7/4.
 */
public class test {
    public static void main(String[] args) throws IOException {
        DaoImpl dao = new DaoImpl();
//        dao.getCount();
        dao.getOne();
//        dao.insert();
//        dao.delete();
//        dao.update();
//        dao.select();
//        System.out.println(SequenceUtils.getSequence(6));
    }
}
