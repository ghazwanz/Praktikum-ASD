package Jobsheet11;
import java.util.Scanner;

public class AntrianSLLMain {
    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa11 inputMhs(){
        String nim,nama,kelas;
        double ipk;
        do {
            System.out.println("Input Data Mahasiswa");
            System.out.print("NIM \t : ");
            nim = sc.nextLine();
            System.out.print("Nama \t : ");
            nama = sc.nextLine();
            System.out.print("Kelas \t : ");
            kelas = sc.nextLine();
            System.out.print("IPK \t : ");
            ipk = sc.nextDouble();
            if(ipk > 4.0 || ipk < 0.0) System.out.println("ipk tidak valid");
        } while (ipk > 4.0 || ipk < 0.0);
        return new Mahasiswa11(nim,nama,kelas,ipk);
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Maksimal Antrian: ");
        int max = sc.nextInt();
        AntrianSLL antrian = new AntrianSLL(max);
        int menu;
        do {
            System.out.println("=== Menu Antrian Mahasiswa ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Melayani Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terbelakang");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Cek Antrian Kosong");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();sc.nextLine();

            switch (menu) {
                case 1:
                    antrian.addLast(inputMhs());
                    break;
                case 2:
                    System.out.println("Melayani Mahasiswa:");
                    antrian.removeFirst();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.getHead();
                    break;
                case 5:
                    antrian.getTail();
                    break;
                case 6:
                    antrian.getSize();
                    break;
                case 7:
                    if (antrian.isFull()) System.out.println("Antrian Penuh");
                    else System.out.println("Antrian Belum Penuh");
                    break;
                case 8:
                    if (antrian.isEmpty()) System.out.println("Antrian Kosong");
                    else System.out.println("Antrian Tidak Kosong");
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 10:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (menu != 10);
    }
}