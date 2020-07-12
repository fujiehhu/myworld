package pojo;

/**
 * Created by lenovo on 20/7/11.
 */
public class Login {
    private String ID;
    private String NAME;
    private String PWD;
//    private String flag; //1 登录 2 注册

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

//    public String getFlag() {
//        return flag;
//    }
//
//    public void setFlag(String flag) {
//        this.flag = flag;
//    }

    @Override
    public String toString() {
        return "Login{" +
                "ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", PWD='" + PWD + '\'' +
                '}';
    }
}
