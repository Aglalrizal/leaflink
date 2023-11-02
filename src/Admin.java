import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
//    List<Organisasi>listOrganisasi = new ArrayList<>();
//    List<Person> listPerson = new ArrayList<>();
//    List<Kampanye>listKampanye = new ArrayList<>();
//    List<Artikel>listArtikel = new ArrayList<>();
    private int totalSumbangan;
    public Admin(){
        super();
        this.role = "Admin";
        System.out.println("Akun berhasil dibuat");
        System.out.println(this.toString());

    }

    public String toString(){
        return super.toString() +
                "Role: " + this.role;
    }
}
