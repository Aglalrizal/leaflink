import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    List<Organisasi>listOrganisasi = new ArrayList<>();
    List<Person> listPerson = new ArrayList<>();
    List<Kampanye>listKampanye = new ArrayList<>();
    List<Artikel>listArtikel = new ArrayList<>();
    private int totalSumbangan;
    public Admin(String userId, String nama, String email, String noHp, String password){
        super(userId, nama, email, noHp, password);
        this.role = "Admin";
    }
    public void addPerson(Person person){
        listPerson.add(person);
    }
    public void addArtikel(Artikel artikel){
        listArtikel.add(artikel);
    }
    public void addOrganisasi(Organisasi organisasi){
        listOrganisasi.add(organisasi);
    }
    public void showArtikel(){
        for (Artikel item:
             listArtikel) {
            System.out.println(item.toString());
        }
    }
    public void showOrganisasi(){
        for (Organisasi item: listOrganisasi
             ) {
            System.out.println(item.toString());
        }
    }
}
