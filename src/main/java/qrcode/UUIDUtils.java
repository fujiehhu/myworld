package qrcode;

import java.util.Date;
import java.util.UUID;

/**
 * 关于UUID的工具类
 *
 * @author 球球
 */
public class UUIDUtils {

    /**
     * 随机生成一个ID
     * RandomUUID+时间戳
     *
     * @return
     */
    public static String randomId() {
        return UUID.randomUUID().toString().replaceAll("-", "") + "-" + new Date().getTime();
    }

    /**
     * 生成二维码所在路径
     *
     * @return
     */
    public static String getQRCodePath() {
        return UUID.randomUUID().toString().replaceAll("-", "") + "-" + new Date().getTime();
    }
}