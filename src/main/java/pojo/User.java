package pojo;

/**
 * Created by fujie on 20/6/28.
 */
public class User {
    private String ID;
    private String NAME;
    private String SEX;
    private String AGE;

    public void setId(String ID) {
        this.ID = ID;
    }

    public void setName(String NAME) {
        this.NAME = NAME;
    }

    public void setAge(String AGE) {
        this.AGE = AGE;
    }

    public void setSex(String SEX) {
        this.SEX = SEX;
    }

    public String getId() {
        return ID;
    }

    public String getName() {
        return NAME;
    }

    public String getAge() {
        return AGE;
    }

    public String getSex() {
        return SEX;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", SEX='" + SEX + '\'' +
                ", AGE=" + AGE +
                '}';
    }
}
