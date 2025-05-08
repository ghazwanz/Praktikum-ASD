package Jobsheet9;
import java.util.Scanner;

public class SuratDemo11 {
    public static void main(String[] args) {
        StackSurat11 stack = new StackSurat11(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin Mahasiswa");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.println("Jenis Izin (I/S/L): ");
                    System.out.println("I (Izin) | S (Sakit) | L (Lainnya)");
                    System.out.print("Pilih: ");
                    char jenis = scan.nextLine().charAt(0);
                    jenis = Character.toUpperCase(jenis);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    Surat11 surat = new Surat11(id,nama,kelas,jenis,durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat11 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Konfirmasi surat: ");
                        String konfirmasi = scan.nextLine();
                        if (konfirmasi.equalsIgnoreCase("ya")){
                            System.out.printf("Surat %s dari %s telah diverifikasi\n",diproses.idSurat,diproses.namaMahasiswa);
                            diproses.tampilSurat();
                        }
                        else
                            System.out.printf("Surat %s dari %s ditolak\n",diproses.idSurat,diproses.namaMahasiswa);                            
                    }
                    break;
                case 3:
                    Surat11 lihat = stack.peek();
                    if (lihat != null)
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String mhs = scan.nextLine();
                    Surat11 cari = stack.searchStack(mhs);
                    if (cari != null) {
                        System.out.println("Surat ditemukan:");
                        cari.tampilSurat();
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih > 0 && pilih < 5);
    }
}