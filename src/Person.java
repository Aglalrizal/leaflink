import java.util.ArrayList;
import java.util.List;

public class Person extends User {
    List<Kampanye> riwayatKampanye = new ArrayList<>();
    public Person(String userId, String nama, String email, String noHp, String password){
        super(userId, nama, email, noHp, password);
    }

}
