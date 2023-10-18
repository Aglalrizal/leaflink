import java.util.ArrayList;

public class UserDatabase {
    private ArrayList<User> users;

    public UserDatabase() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login berhasil. Selamat datang, " + username + "!");
                return true;
            }
        }
        System.out.println("Login gagal. Coba lagi.");
        return false;
    }
}

