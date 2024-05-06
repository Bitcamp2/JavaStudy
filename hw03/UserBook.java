package hw03;

public class UserBook {

    static User[] users = new User[100];
    int index = 0;

    public User[] saveUserInfo(String username, String password) {

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);
        user.setId(index + 1);
        users[index++] = user;

        return users;
    }

    public static void main(String[] args) {
        UserBook userBook = new UserBook();

        userBook.saveUserInfo("bobaesj", "1234");
        userBook.saveUserInfo("bobaesh", "2234");
        userBook.saveUserInfo("bobaesf", "32345");
        userBook.saveUserInfo("bobaest", "422344");

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println("아이디: " + users[i].getId() + ", 이름: " + users[i].getUsername() + ", 비번: " + users[i].getPassword());
            }
        }
    }
}
