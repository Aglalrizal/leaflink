public class User {
    protected String userId;
    protected String username;
    protected String nama;
    protected String email;
    protected String noHp;
    protected String password;
    protected String role;

    /**
     * inisialisasi objek user
     * @param userId unik
     * @param nama nama objek
     * @param email email obje
     * @param noHp no hp objek
     * @param password password
     */
    public User(String userId, String username, String nama, String email, String noHp, String password) {
        this.userId = userId;
        this.getUsername = username;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "UserId: "+getUserId()+ "\n" +
                "Nama: "+ getNama()+ "\n" +
                "Email: "+getEmail()+ "\n" +
                "No hp: "+getNoHp()+"\n";
    }
}
