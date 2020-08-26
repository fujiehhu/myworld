import dao.Impl.DaoImpl;
import utils.SequenceUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fujie on 20/7/4.
 */
public class test {
    public static void main(String[] args) throws IOException {
        //多参数查询，参数放入 map
        DaoImpl dao = new DaoImpl();
        ArrayList<Map<String, Object>> maps = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Map<String, Object> params = new HashMap<>();
            params.put("ID", i);
            params.put("PWD", Math.round(Math.random() * 100 % 50) + "");
            params.put("NAME", "man");
            maps.add(params);

        }
        dao.insert(maps);
//        dao.getCount();
//        dao.getOne();

//        dao.delete(params);
//        dao.update(params);
//        params.clear();
//        for (int i = 0; i < 30; i++) {
//            params.put("ID", SequenceUtils.getSequence(6));
//            params.put("NAME", "千年老妖" + i + "号");
//            params.put("SEX", "不男不女");
//            params.put("AGE", "老不死的" + i * 10 + "岁");
//            dao.insert(params);
//            params.clear();
//        }
//        params.put("ID","20200706214426776800");
//        params.put("count",5);
//        dao.getOne(params);
        Map<String, Object> params1 = new HashMap<>();
        params1.put("start", "0");
        params1.put("count", "2");
//        dao.select(params1);
//        dao.select(params1);
    }
}
