package P2Jobsheet10;

public class Mahasiswa11 {
    String nim,nama,prodi,kelas;

    Mahasiswa11(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilkanData() {
        System.out.printf("%s - %s - %s - %s\n", nim, nama, prodi, kelas);
    }
}