import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Organisasi extends User {
    private String deskripsi;
    private String namaKetua;
    private List<Kampanye> listKampanye = new ArrayList<>();
    private List<Artikel> listArtikel = new ArrayList<>();
    public Organisasi(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama ketua: ");
        this.namaKetua = scanner.nextLine();
        System.out.println("Deskripsi: ");
        this.deskripsi = scanner.nextLine();
        this.role = "Organisasi";
    }
    public Organisasi(String nama, String username, String email, String noHp, String password, String namaKetua, String deskripsi){
        super(nama, username, email, noHp, password);
        this.namaKetua = namaKetua;
        this.deskripsi = deskripsi;
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
