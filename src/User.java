import java.util.ArrayList;
import java.util.List;

public class User extends People{
    List<Kampanye> riwayatKampanye = new ArrayList<>();
    public User(String userId, String nama, String email, String noHp, String password){
        super(userId, nama, email, noHp, password);
    }
}
