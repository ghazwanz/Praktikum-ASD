package Jobsheet12;

public class Mahasiswa11 {
    String nim,nama, kelas;
    Double ipk;

    Mahasiswa11(String nim, String nama, String kelas, Double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil(){
        System.out.printf("NIM: %s, Nama: %s, Kelas: %s, IPK: %.2f \n", nim, nama, kelas, ipk);
    }
}