package session6_2_singleton;

public class User {
    private static volatile User instance;
    private String userName;
    private Long password;
    private String email;
    private User(String userName, Long password, String email){
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public static User getInstance(String userName,Long password,String email){
        User result = instance;
        if (result == null){
            synchronized (User.class){
                result = instance;
                if(instance == null){
                    instance = new User(userName,password,email);
                }
            }
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public Long getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
