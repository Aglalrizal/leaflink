import java.util.ArrayList;
import java.util.List;

public class Person extends User {
    List<Kampanye> riwayatKampanye = new ArrayList<>();
    public Person(){
        super();
        this.role = "Person";
    }
    public Person(String username, String nama, String email, String noHp, String password){
        super(username, nama, email, noHp, password);
        this.role = "Person";
    }

}
