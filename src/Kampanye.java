import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kampanye {
    private String idKampanye;
    private String nama;
    private String deskripsi;
    private List<Person>volunteer = new ArrayList<>();
    private int jumlahVolunteer;
    private String lokasi;
    private int targetPendanaan;
    private int sumbangan;
    public static int indexKampanye = 0;
    public Kampanye(){
        Scanner scanner = new Scanner(System.in);
        setIdKampanye();
        System.out.println("Nama: ");
        this.nama = scanner.nextLine();
        System.out.println("Lokasi: ");
        this.lokasi = scanner.nextLine();
        System.out.println("Deskripsi: ");
        this.deskripsi = scanner.nextLine();
        System.out.println("Target Pendanaan: ");
        this.targetPendanaan = scanner.nextInt();
        System.out.println("Jumlah Volunteer");
        this.jumlahVolunteer = scanner.nextInt();
    }
    public Kampanye(String nama, String lokasi, String deskripsi, int targetPendanaan, int jumlahVolunteer){
        setIdKampanye();
        this.nama = nama;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.targetPendanaan = targetPendanaan;
        this.jumlahVolunteer = jumlahVolunteer;
    }
    public void setIdKampanye(){
        indexKampanye++;
        this.idKampanye = "lf-cmp-"+indexKampanye;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

    public String getIdKampanye() {
        return idKampanye;
    }

    public String getNama() {
        return nama;
    }

    public List<Person> getVolunteer() {
        return volunteer;
    }

    public int getJumlahVolunteer() {
        return jumlahVolunteer;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getTargetPendanaan() {
        return targetPendanaan;
    }

    public int getSumbangan() {
        return sumbangan;
    }

    public void addVolunteer(Person person){
        volunteer.add(person);
    }
    public void sumbangan(int sumbangan){
        this.sumbangan = sumbangan;
    }
    public String toString(){
        return "Id Kampanye: "+getIdKampanye()+
                "\nNama: "+getNama()+
                "\nLokasi: "+getLokasi()+
                "\nTarget Pendanaan: "+getTargetPendanaan()+
                "\nUang Terkumpul: "+getSumbangan()+
                "\nDeskripsi: "+getDeskripsi();
    }
}
