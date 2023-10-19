import java.util.ArrayList;
import java.util.List;

public class Artikel {
    private String idArtikel;
    private String judul;
    private String konten;
    private Organisasi organisasi;

    public Artikel(String idArtikel, Organisasi organisasi, String judul, String konten) {
        this.idArtikel = idArtikel;
        this.organisasi = organisasi;
        this.judul = judul;
        this.konten = konten;
    }

    public Artikel(String idArtikel, Organisasi organisasi, String judul) {
        this.idArtikel = idArtikel;
        this.organisasi = organisasi;
        this.judul = judul;
    }

    public String getIdArtikel() {
        return idArtikel;
    }

    public String getJudul() {
        return judul;
    }

    public String getKonten() {
        return konten;
    }

    public Organisasi getAuthor(){
        return organisasi;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public String toString(){
        return  "Id Artikel: " + getIdArtikel() + "\n" +
                "Judul: " + getJudul() + "\n" +
                "Konten: " + getKonten() + "\n" +
                "Author: " + getAuthor() + "\n";
    }
}

public class ArtikelManager {
    private List<Artikel> artikelList;

    public ArtikelManager() {
        artikelList = new ArrayList<>();
    }

    public void tambahArtikel(Artikel artikel) {
        artikelList.add(artikel);
    }

    public void hapusArtikel(String idArtikel) {
        artikelList.removeIf(artikel -> artikel.getIdArtikel().equals(idArtikel));
    }

    public void tampilkanArtikel() {
        for (Artikel artikel : artikelList) {
            System.out.println(artikel.toString());
        }
    }

    public static void main(String[] args) {
        Organisasi organisasi1 = new Organisasi("Org1", "org1@example.com");
        Organisasi organisasi2 = new Organisasi("Org2", "org2@example.com");

        ArtikelManager artikelManager = new ArtikelManager();

        Artikel artikel1 = new Artikel("1", organisasi1, "Judul Artikel 1", "Konten Artikel 1");
        Artikel artikel2 = new Artikel("2", organisasi2, "Judul Artikel 2", "Konten Artikel 2");

        artikelManager.tambahArtikel(artikel1);
        artikelManager.tambahArtikel(artikel2);

        System.out.println("Daftar Artikel:");
        artikelManager.tampilkanArtikel();

        System.out.println("Menghapus artikel dengan ID 1:");
        artikelManager.hapusArtikel("1");

        System.out.println("Daftar Artikel setelah penghapusan:");
        artikelManager.tampilkanArtikel();
    }
}