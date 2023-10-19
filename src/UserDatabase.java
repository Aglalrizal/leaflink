import java.util.ArrayList;
import java.util.Scanner;

public class UserDatabase {
    private ArrayList<User> users;
    private ArrayList<Artikel> articles;
    private ArrayList<Kampanye> campaign;
    public static int indexOrganisasi;

    public User currentUser;

    public UserDatabase() {
        users = new ArrayList<>();
        articles = new ArrayList<>();
        campaign = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void register(){
        Scanner input = new Scanner(System.in);
        System.out.println("Register sebagai: \n1. Personal \n2.Organisasi \njawaban: ");
        int tmp = input.nextInt();
        if (tmp == 1){
            Person person1 = new Person();
            addUser(person1);
        }else if (tmp == 2){
            Organisasi organisasi1 = new Organisasi();
            addUser(organisasi1);
        }
    }

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login berhasil. Selamat datang, " + username + "!");
                setCurrentUser(user);
                return true;
            }
        }
        System.out.println("Login gagal. Coba lagi.");
        return false;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public User getCurrentUser() {
        return currentUser;
    }
}

