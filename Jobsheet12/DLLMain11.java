package Jobsheet12;
import java.util.Scanner;

public class DLLMain11 {
    public static void main(String[] args) {
        DoubleLinkedList11 list = new DoubleLinkedList11();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah Data di awal");
            System.out.println("2. Tambah Data di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Menambahkan Data Setelah NIM Tertentu");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("8. Menambahkan Data Pada Indeks Tertentu");
            System.out.println("9. Hapus Data Setelah NIM Tertentu");
            System.out.println("10. Hapus Data Pada Indeks Tertentu");
            System.out.println("11. Tampilkan Data Pertama");
            System.out.println("12. Tampilkan Data Terakhir");
            System.out.println("13. Tampilkan Data Pada Indeks Tertentu");
            System.out.println("14. Tampilkan Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1->{
                    Mahasiswa11 mhs = inputMhs(scan);
                    list.addFirst(mhs);
                }
                case 2->{
                    Mahasiswa11 mhs = inputMhs(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Menambahkan Mahasiswa Setelah NIM: ");
                    String nim = scan.nextLine();
                    System.out.println();
                    Mahasiswa11 mhs = inputMhs(scan);
                    list.insertAfter(nim, mhs);
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node11 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    }else System.out.println("Data tidak ditemukan.");
                }
                case 8 -> {
                    System.out.print("Menambahkan Mahasiswa Pada Indeks: ");
                    int index = scan.nextInt();
                    System.out.println(); scan.nextLine();
                    Mahasiswa11 mhs = inputMhs(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Menghapus Mahasiswa Setelah NIM: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 10 -> {
                    System.out.print("Menghapus Mahasiswa Pada Indeks: ");
                    int index = scan.nextInt();
                    list.remove(index);
                }
                case 11 -> {
                    Node11 first = list.getFirst();
                    if (first!=null) {
                        System.out.println("Data Mahasiswa Pertama Adalah:");
                        first.data.tampil();
                    }
                    else System.out.println("Data Kosong");
                }
                case 12 -> {
                    Node11 last = list.getLast();
                    if (last!=null) {
                        System.out.println("Data Mahasiswa Terakhir Adalah:");
                        last.data.tampil();
                    }
                    else System.out.println("Data Kosong");
                }
                case 13 -> {
                    System.out.print("Lihat Mahasiswa Pada Indeks: ");
                    int index = scan.nextInt();
                    Node11 mhsIndex = list.getIndex(index);
                    if (mhsIndex!=null) {
                        System.out.printf("Data Mahasiswa Pada Indeks %s Adalah:\n", index);
                        mhsIndex.data.tampil();
                    }else System.out.printf("Mahasiswa pada indeks %s tidak ada\n",index);
                }
                case 14 -> System.out.printf("Jumlah Data Mahasiswa Pada Node: %s\n",list.getSize());
                case 0 -> System.out.println("Keluar dari progam.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
    public static Mahasiswa11 inputMhs(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        Double ipk = scan.nextDouble();
        Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
        return mhs;
    }
}
