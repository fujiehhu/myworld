package Dao;

import java.io.IOException;

/**
 * Created by fujie on 20/6/28.
 */
public interface IDao {
    void select() throws IOException;

    void update() throws IOException;

    void delete() throws IOException;

    void insert() throws IOException;
}
