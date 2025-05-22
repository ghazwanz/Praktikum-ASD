package Jobsheet11;
import java.util.Scanner;

public class SLLMain11 {
    // Modifikasi Pertanyaan Percobaan 1
    // static Scanner sc = new Scanner(System.in);
    // public static Mahasiswa11 inputMhs(){
    //     String nim,nama,kelas;
    //     double ipk;
    //     do {
    //         System.out.println("Input Data Mahasiswa");
    //         System.out.print("NIM \t : ");
    //         nim = sc.nextLine();
    //         System.out.print("Nama \t : ");
    //         nama = sc.nextLine();
    //         System.out.print("Kelas \t : ");
    //         kelas = sc.nextLine();
    //         System.out.print("IPK \t : ");
    //         ipk = sc.nextDouble();
    //         if(ipk > 4.0 || ipk < 0.0) System.out.println("ipk tidak valid");
    //     } while (ipk > 4.0 || ipk < 0.0);
    //     return new Mahasiswa11(nim,nama,kelas,ipk);
    // }
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();
        // Modifikasi Pertanyaan Percobaan 1
        // int menu;

        Mahasiswa11 mhs1 = new Mahasiswa11("24212200","Alvaro","1A",4.0);
        Mahasiswa11 mhs2 = new Mahasiswa11("23212201","Bimon","2B",3.8);
        Mahasiswa11 mhs3 = new Mahasiswa11("22212202","Cintia","3C",3.5);
        Mahasiswa11 mhs4 = new Mahasiswa11("21212203","Dirga","4D",3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter ("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa Bimon pada index : "+ sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        // Modifikasi Pertanyaan Percobaan 1
        // do {
        //     System.out.println("=== Menu Input Data Mahasiswa ===");
        //     System.out.println("1. Menambahkan Data Mahasiswa di Depan");
        //     System.out.println("2. Menambahkan Data Mahasiswa di Belakang");
        //     System.out.println("3. Menambahkan Data Mahasiswa Setelah Data Tertentu");
        //     System.out.println("4. Menambahkan Data Mahasiswa pada Indeks Tertentu");
        //     System.out.println("5. Menampilkan Daftar Mahasiswa");
        //     System.out.println("6. Keluar");
        //     System.out.println("==================================");
        //     System.out.print("Pilih Menu: ");
        //     menu = sc.nextInt();sc.nextLine();
        //     switch (menu) {
        //         case 1:
        //             sll.addFirst(inputMhs());
        //             break;
        //         case 2:
        //             sll.addLast(inputMhs());
        //             break;
        //         case 3:
        //             System.out.print("Masukkan Nama mahasiswa yang dicari:");
        //             String nama = sc.nextLine();
        //             sll.insertAfter(nama, inputMhs());
        //             break;
        //         case 4:
        //             System.out.print("Masukkan Indeks yang diinginkan:");
        //             int index = sc.nextInt();
        //             sc.nextLine();
        //             sll.insertAt(index, inputMhs());
        //             break;
        //         case 5:
        //             sll.print();
        //             break;
        //         case 6: 
        //             System.out.println("Terima kasih");
        //             break;
        //         default:
        //             System.out.println("Menu tidak valid");
        //             break;
        //     }
        // } while (menu != 6);
    }
}
