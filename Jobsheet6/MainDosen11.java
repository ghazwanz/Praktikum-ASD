package Jobsheet6;

import java.util.Scanner;

public class MainDosen11 {
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

        System.out.println("Data dosen sebelum sorting: ");
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia (ASC): ");
        list.SortingASC();
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia (DSC): ");
        list.sortingDSC();
        list.tampil();
    }
}
