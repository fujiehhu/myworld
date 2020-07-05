package Dao;

import java.io.IOException;
import java.util.Map;

/**
 * Created by fujie on 20/6/28.
 */
public interface IDao {
    void select(Map<String, Object> params) throws IOException;

    void update(Map<String, Object> params) throws IOException;

    void delete(Map<String, Object> params) throws IOException;

    void insert(Map<String, Object> params) throws IOException;
}
