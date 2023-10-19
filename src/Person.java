import java.util.ArrayList;
import java.util.List;

public class Person extends User {
    private List<Kampanye> riwayatKampanye = new ArrayList<>();
    public Person(){
        super();
        this.role = "Person";
    }
    public Person(String username, String nama, String email, String noHp, String password){
        super(username, nama, email, noHp, password);
        this.role = "Person";
    }
    public void addRiwayatKampanye(Kampanye kampanye){
        this.riwayatKampanye.add(kampanye);
    }
    public String showRiwayatKampanye(){

    }
    public String toString() {
        return "UserId: "+getUserId()+ "\n" +
                "Nama: "+ getNama()+ "\n" +
                "Email: "+getEmail()+ "\n" +
                "No hp: "+getNoHp()+
                "\nRiwayat kampanye yang diikuti: "+showRiwayatKampanye();
    }
}
