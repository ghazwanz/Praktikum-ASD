package TugasJobsheet10;
import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAntrian = 10;
        AntrianKRS antrian = new AntrianKRS(maxAntrian);
        int menu;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah Mahasiswa ke Antrian");
            System.out.println("5. Layani Mahasiswa");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Lihat 2 Antrian Terdepan");
            System.out.println("8. Lihat Antrian Paling Belakang");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Yang Sudah Melakukan Proses KRS");
            System.out.println("11. Cetak Jumlah Yang Belum Melakukan Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (antrian.isEmpty()) System.out.println("Antrian kosong.");
                    else System.out.println("Antrian tidak kosong.");
                    break;
                case 2:
                    if (antrian.isFull()) System.out.println("Antrian penuh.");
                    else System.out.println("Antrian tidak penuh.");
                    break;
                case 3:
                    antrian.clear();
                    break;
                case 4:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 5:
                    Mahasiswa11[] dilayani = antrian.prosesKRSMhs();
                    if (dilayani[0] != null) {
                        System.out.print("Melayani mahasiswa: ");
                        System.out.println("NIM - Nama - Prodi - Kelas");
                        for (int i = 0; i < dilayani.length; i++) {
                            System.out.print((i + 1) + ". ");
                            dilayani[i].tampilkanData();
                        }
                    }
                    break;
                case 6:
                    antrian.lihatAntrian();
                    break;
                case 7:
                    antrian.lihat2AntrianTerdepan();
                    break;
                case 8:
                    antrian.lihatAntrianAkhir();
                    break;
                case 9:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah yang sudah melakukan proses KRS: " + antrian.getMhsSudahKRS());
                    break;
                case 11:
                    System.out.println("Jumlah yang belum melakukan proses KRS: " + antrian.getMhsBelumKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 0);
    }
}