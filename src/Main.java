public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin("1", "admin1", "admin1@gmail.com", "08123456789", "admin123");
        System.out.println(admin1.toString());
        Organisasi organisasi1 = new Organisasi("2", "Organisasi1", "organ1@gmail.com", "08123456789", "organ01", "Lets stay alive");
        admin1.addOrganisasi(organisasi1);
        admin1.showOrganisasi();
        Artikel artikel1 = new Artikel("1", organisasi1, "hijau", "reboisasi penting banget loh" );
        organisasi1.addArtikel(artikel1);
        admin1.addArtikel(artikel1);
        artikel1.toString();
    }
}