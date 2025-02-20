package Jobsheet2;

public class Matakuliah11 {
    String kodeMK,nama;
    int sks,jumlahJam;

    public Matakuliah11(){
    }

    public Matakuliah11(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("============ Mata Kuliah ============");
        System.out.printf("Kode Matakuliah: %s\n",kodeMK);
        System.out.printf("Nama Matakuliah: %s\n",nama);
        System.out.printf("Jumlah SKS: %s\n",sks);
        System.out.printf("Jumlah jam: %s\n",jumlahJam);
        System.out.println("=====================================");
    }
    void ubahSKS(int sks){
        if (sks < 0) {
            System.out.println("Input SKS tidak valid!");
            return;
        }
        this.sks = sks;
    }

    void tambahJam(int jam){
        if (jam < 0) {
            System.out.println("Input Penambahan Jam Tidak Valid!");
            return;
        }
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jam > jumlahJam) {
            System.out.println("Input Pengurangan Jam Melebihi Atau Sama Dengan Jumlah Jam!");
            return;
        }
        if (jam < 0) {
            System.out.println("Input Pengurangan Jam Tidak Valid!");
            return;
        }
        jumlahJam -= jam;
    }
}