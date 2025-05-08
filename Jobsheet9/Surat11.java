package Jobsheet9;

public class Surat11 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    Surat11() {
    };

    Surat11(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampilSurat() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        String jenis = (jenisIzin == 'I') ? "Izin" : (jenisIzin == 'S') ? "Sakit" : "Lainnya";
        System.out.printf("Jenis Izin: %s (%s)\n", jenisIzin, jenis);
        System.out.println("Durasi: " + durasi + " hari");
    }
}