import Dao.Impl.DaoImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 20/7/4.
 */
public class test {
    public static void main(String[] args) throws IOException {
        //多参数查询，参数放入 map
        Map<String, Object> params = new HashMap<>();
//        params.put("ID", SequenceUtils.getSequence(6));
        params.put("ID", "003");
        params.put("NAME", "千年老妖");
//        params.put("SEX", "不男不女");
//        params.put("AGE", "老不死的");

        DaoImpl dao = new DaoImpl();
//        dao.getCount();
//        dao.getOne();
//        dao.insert(params);
        dao.delete(params);
//        dao.update(params);
//        params.clear();
//        dao.select(params);
    }
}
