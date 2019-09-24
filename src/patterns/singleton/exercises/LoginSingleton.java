package patterns.singleton.exercises;

public class LoginSingleton {
    private static LoginSingleton loginSingleton;
    private String username;
    private String password;

    public static LoginSingleton getInstance(String username, String password) {
        if (loginSingleton == null) {
            loginSingleton = new LoginSingleton();
            loginSingleton.setUsername(username);
            loginSingleton.setPassword(password);
        }
        return loginSingleton;
    }

    private LoginSingleton() { }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
}
