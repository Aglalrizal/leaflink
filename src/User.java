public class User {
    private String userId;
    private String nama;
    private String email;
    private String noHp;
    private String password;

    /**
     * inisialisasi objek user
     * @param userId unik
     * @param nama nama objek
     * @param email email obje
     * @param noHp no hp objek
     * @param password password
     */
    public User(String userId, String nama, String email, String noHp, String password) {
        this.userId = userId;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
        this.password = password;
    }

    public String getUserId() {
        return userId;
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
