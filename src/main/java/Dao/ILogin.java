package Dao;

import java.io.IOException;
import java.util.Map;

/**
 * Created by lenovo on 20/7/11.
 */
public interface ILogin {

    int checkUser(Map<String, Object> params) throws IOException;

}
