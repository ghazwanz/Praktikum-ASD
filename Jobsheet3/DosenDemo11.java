package Jobsheet3;
import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen11[] arrayOfDosen = new Dosen11[3];
        DataDosen11 dataDosen = new DataDosen11();
        for (int i = 0; i < arrayOfDosen.length; i++) {
            String kode,nama;
            boolean jenisKelamin;
            int usia;
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode Dosen    : ");
            kode = sc.nextLine();
            System.out.print("Nama Dosen    : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            System.out.println("------------------------------");
            sc.nextLine();
            arrayOfDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
        }

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}