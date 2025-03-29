package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------------------");
            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        list.insertionSort();
        System.out.println("Data mahasiswa: ");
        list.tampil();

        // Melakukan Pencarian Data Binary
        System.out.println("------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearch(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
    }
}