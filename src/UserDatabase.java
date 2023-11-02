import java.util.ArrayList;
import java.util.Scanner;

public class UserDatabase {
    public ArrayList<User> users;
    public ArrayList<Artikel> articles;
    public ArrayList<Kampanye> campaigns;

    public User currentUser;

    public UserDatabase() {
        users = new ArrayList<>();
        articles = new ArrayList<>();
        campaigns = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void register(){
        Scanner input = new Scanner(System.in);
        System.out.println("Register sebagai: \n1.Personal \n2.Organisasi \njawaban: ");
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
                if (user.getRole().equals("Admin")){
                    Main.menuAdmin();
                } else if (user.getRole().equals("Person")) {
                    Main.menuUser();
                } else if (user.getRole().equals("Organisasi")) {
                    Main.menuOrganisasi();
                }
                return true;
            }
        }
        System.out.println("Login gagal. Coba lagi.");
        return false;
    }
    public void logout(){
    }
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public User getCurrentUser() {
        return currentUser;
    }
    public void addPerson(Person person){
        users.add(person);
    }
    public void addArtikel(Artikel artikel){
        articles.add(artikel);
    }

    public void showArtikel(){
        for (Artikel item:
                articles) {
            System.out.println(item.toString());
        }
    }
//    public void showOrganisasi(){
//        for (Organisasi item: listOrganisasi
//        ) {
//            System.out.println(item.toString());
//        }
//    }

    public void hapusUser(User user){
        users.remove(user);
    }
    public void hapusArtikel(Artikel artikel){
        articles.remove(artikel);
    }
    public void hapusKampanye(Kampanye kampanye){
        campaigns.remove(kampanye);
    }
}

