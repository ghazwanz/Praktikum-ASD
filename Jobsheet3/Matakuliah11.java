package Jobsheet3;
import java.util.Scanner;
public class Matakuliah11 {
    static Scanner sc = new Scanner(System.in);
    public String kode,nama;
    public int sks, jumlahJam;
    public Matakuliah11(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------");
    }

    void tampilkanData(int i) {
        System.out.println("Data Matakuliah ke-" + (i + 1));
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
}
