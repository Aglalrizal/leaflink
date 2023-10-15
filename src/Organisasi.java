import java.util.ArrayList;
import java.util.List;

public class Organisasi extends User {
    private String deskripsi;
    private List<Kampanye> listKampanye = new ArrayList<>();
    private List<Artikel> listArtikel = new ArrayList<>();
    public Organisasi(String userId, String nama, String email, String noHp, String password, String deskripsi){
        super(userId, nama, email, noHp, password);
        this.deskripsi = deskripsi;
    }
    public Organisasi(String userId, String nama, String email, String noHp, String password){
        super(userId, nama, email, noHp, password);
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void addArtikel(Artikel artikel){
        listArtikel.add(artikel);
    }
    public String toString(){
        return super.toString()+
                "Deskripsi: "+getDeskripsi()+"\n";

    }
}
