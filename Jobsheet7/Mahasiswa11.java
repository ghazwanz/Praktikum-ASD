package Jobsheet7;

public class Mahasiswa11 {
    String nim,nama, kelas;
    double ipk;

    Mahasiswa11(){
    }

    Mahasiswa11(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
