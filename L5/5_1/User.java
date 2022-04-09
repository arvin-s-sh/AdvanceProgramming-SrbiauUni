package session6_1;

public class User {
    private String userName;
    private String realName;
    private long password;
    private int age;
    private String address;
    private long phoneNumber;
    private String education;


    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public User setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public long getPassword() {
        return password;
    }

    public User setPassword(long password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public User setEducation(String education) {
        this.education = education;
        return this;
    }
}
