package Jobsheet11;

public class Mahasiswa11 {
    String nim,nama,kelas;
    double ipk;

    public Mahasiswa11(){}
    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi(){
        System.out.printf("%s \t %-18s %-8s \t %.1f\n", nim, nama, kelas, ipk);
    }
}
