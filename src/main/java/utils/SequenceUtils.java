package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by fujie on 20/7/4.
 */
public class SequenceUtils {
    //获取唯一键值
    //length :后缀长度
    public static String getSequence(int length) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        // new Date()为获取当前系统时间
        String res = df.format(new Date());
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        if (length < 0) {
            length = 0;
        }
        for (int i = 0; i < length; i++) {
            rs.append(r.nextInt(10));
        }
        return res + rs;

    }
}


