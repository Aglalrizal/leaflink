public class Artikel {
    private String idArtikel;
    private String judul;
    private String konten;
    private String idAuthor;

    public Artikel(String idArtikel, String judul, String konten, String idAuthor) {
        this.idArtikel = idArtikel;
        this.judul = judul;
        this.konten = konten;
        this.idAuthor = idAuthor;
    }

    public Artikel(String idArtikel, String judul, String idAuthor) {
        this.idArtikel = idArtikel;
        this.judul = judul;
        this.idAuthor = idAuthor;
    }

}
