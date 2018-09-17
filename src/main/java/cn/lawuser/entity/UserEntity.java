package cn.lawuser.entity;

/**
 * @author nozomi
 * @date 2018/9/14 21:55
 * @description
 */
public class UserEntity {
    private int id;
    private String userName;
    private String password;
    private String realName;
    private String phoneNumber;
    private String email;
    private long regisTime;
    private long payTime;
    private boolean isPay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getRegisTime() {
        return regisTime;
    }

    public void setRegisTime(long regisTime) {
        this.regisTime = regisTime;
    }

    public long getPayTime() {
        return payTime;
    }

    public void setPayTime(long payTime) {
        this.payTime = payTime;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    @Override
    public String toString(){
        return userName+"  "+regisTime;
    }
}
