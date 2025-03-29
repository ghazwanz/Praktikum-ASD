package Jobsheet7;

import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen11 list = new DataDosen11();
        for (int i = 0; i < list.dataDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen            : ");
            String kode = sc.nextLine();
            System.out.print("Nama                  : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L / P) : ");
            String jenisKelamin = sc.nextLine();
            Boolean jk = jenisKelamin.equalsIgnoreCase("L") ? false : true;
            System.out.print("Usia                  : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------");
            Dosen11 dosen = new Dosen11(kode, nama, jk, usia);
            list.tambah(dosen);
        }

        System.out.println("Data dosen: ");
        list.tampil();

        System.out.println("----------------------------------");
        System.out.println("Pencarian Data Dosen dengan Sequential Search");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Usia Dosen yang dicari : ");
        int cari = sc.nextInt();
        System.out.println("----------------------------------");
        int posisi=list.PencarianDataSequential11(cari);
        list.tampilDataSearch(cari, posisi);
        System.out.println("----------------------------------");

        System.out.println("Data dosen terurut ASC: ");
        list.SortingASC();
        list.tampil();

        System.out.println("----------------------------------");
        System.out.println("Pencarian Data Dosen dengan Binary Search");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Usia Dosen yang dicari : ");
        cari = sc.nextInt();
        System.out.println("----------------------------------");
        posisi=list.PencarianDataBinary11(cari, 0, list.dataDosen.length-1);
        list.tampilDataSearch(cari, posisi);
    }
}
