public class Artikel {
    private String idArtikel;
    private String judul;
    private String konten;
    private Organisasi organisasi;

    public Artikel(String idArtikel, Organisasi organisasi, String judul, String konten) {
        this.idArtikel = idArtikel;
        this.judul = judul;
        this.konten = konten;
        this.organisasi = organisasi;
    }

    public Artikel(String idArtikel, Organisasi organisasi, String judul) {
        this.idArtikel = idArtikel;
        this.judul = judul;
        this.organisasi = organisasi;
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
        return  "UserId: "+getIdArtikel()+ "\n" +
                "Author: "+getAuthor() + "\n" +
                "Email: "+getJudul()+ "\n" +
                "No hp: "+getKonten()+"\n";
    }
}
