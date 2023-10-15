import java.util.ArrayList;
import java.util.List;

public class Admin extends People {
    List<Organisasi>listOrganisasi = new ArrayList<>();
    List<User>listUser = new ArrayList<>();
    List<Kampanye>listKampanye = new ArrayList<>();
    private int totalSumbangan;
    public Admin(String userId, String nama, String email, String noHp, String password){
        super(userId, nama, email, noHp, password);
    }
}
