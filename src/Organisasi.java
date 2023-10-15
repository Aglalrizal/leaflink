import java.util.ArrayList;
import java.util.List;

public class Organisasi extends People {
    private String deskripsi;
    private List<Kampanye> listKampanye = new ArrayList<>();
    public Organisasi(String userId, String nama, String email, String noHp, String password, String deskripsi){
        super(userId, nama, email, noHp, password);
        this.deskripsi = deskripsi;
    }
    public Organisasi(String userId, String nama, String email, String noHp, String password){
        super(userId, nama, email, noHp, password);
    }
}
