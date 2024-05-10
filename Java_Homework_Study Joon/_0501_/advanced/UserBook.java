package _240501_.advanced;

import _240501_.basic.User;

public class UserBook {
    public User[] userBook = new User[100];

    public int index;
    public String username;
    public String password;

    public UserBook() {

    }

    public void safeUserInfo(String username, String password) {
        User user = new User();

        user.username = username;
        user.password = password;
        userBook[index + 1] = user;

    }

}
