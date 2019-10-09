package bean;

/**
 * @Author DreamYee
 * @Create 2019/7/16  8:19
 */
public class UserInfo {
    private Integer id;
    private String userName;
    private String password;
    private String company;
    private String realName;
    private String phone;
    private Integer score;

    public UserInfo(){}

    public UserInfo(Integer id, String userName, String password, String company, String realName, String phone, Integer score) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.company = company;
        this.realName = realName;
        this.phone = phone;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
