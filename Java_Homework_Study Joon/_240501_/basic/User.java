package _240501_.basic;

public class User {

    public long id;
    public String username;
    public String password;

    public User() {

    }

    private long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    private String getUsername() {
        return username;
    }
    private void setUsername(String username) {
        this.username = username;
    }

    private String getPassword() {
        return password;
    }
    private void setPassword(String password) {
        this.password = password;
    }


}
