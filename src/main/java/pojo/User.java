package pojo;

/**
 * Created by fujie on 20/6/28.
 */
public class User {
    private String ID;
    private String NAME;
    private String SEX;
    private String AGE;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getAGE() {
        return AGE;
    }

    public String getSEX() {
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
