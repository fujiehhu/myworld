package pojo;

/**
 * Created by fujie on 20/6/28.
 */
public class User {
    private int ID;
    private String NAME;
    private String SEX;
    private int AGE;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAGE() {
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
