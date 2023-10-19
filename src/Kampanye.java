import java.util.ArrayList;
import java.util.List;

public class Kampanye {
    private String idKampanye;
    private String nama;
    private String deskripsi;
    private List<Person> volunteer = new ArrayList<>();
    private String lokasi;
    private int targetPendanaan;
    private int sumbangan;

    public Kampanye(String idKampanye, String nama, String deskripsi, String lokasi, int targetPendanaan) {
        this.idKampanye = idKampanye;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.targetPendanaan = targetPendanaan;
    }

    public void tambahKampanye() {
    }

    public void tampilkanKampanye() {
    }

    public void editKampanye(String namaBaru, String deskripsiBaru, String lokasiBaru, int targetPendanaanBaru) {
        this.nama = namaBaru;
        this.deskripsi = deskripsiBaru;
        this.lokasi = lokasiBaru;
        this.targetPendanaan = targetPendanaanBaru;
    }

    public void tambahVolunteer(Person volunteer) {
        this.volunteer.add(volunteer);
    }
}
