import java.util.Scanner;

public class MataKuliah {
    static Scanner sc = new Scanner(System.in);
    static int jumlahMatkul = 0;
    static int sks[];
    static int semester[];
    static String matkul[];
    static String hari[];

    static void menu() {
        byte menu;
        do {
            System.out.println("==========================");
            System.out.println("Menu Mata Kuliah");
            System.out.println("==========================");
            System.out.println("1. Input Data Mata Kuliah");
            System.out.println("2. Tampilkan Jadwal Mata Kuliah");
            System.out.println("3. Tampilkan Mata Kuliah Berdasarkan Hari");
            System.out.println("4. Tampilkan Mata Kuliah Berdasarkan Semester");
            System.out.println("5. Tampilkan Mata Kuliah Berdasarkan Nama");
            System.out.println("6. Keluar");
            System.out.print("Input Menu: ");
            menu = sc.nextByte();
            switch (menu) {
                case 1:
                    inputMatKul();
                    break;
                case 2:
                    tampilJadwal();
                    break;
                case 3:
                    tampilHari();
                    break;
                case 4:
                    tampilSemester();
                    break;
                case 5:
                    tampilMatkul();
                    break;
                case 6:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Input Menu Tidak Valid!");
                    break;
            }
        } while (menu != 6);
    }

    static boolean validateJml() {
        boolean isEmpty = jumlahMatkul <= 0 ? true : false;
        return isEmpty;
    }

    static void inputMatKul() {
        boolean isEmpty = validateJml();
        if (!isEmpty){
            System.out.println("Data Sudah Ada");
            return;
        }
        while (true) {
            System.out.print("Masukkan Jumlah Mata Kuliah yang Ingin Ditambahkan: ");
            jumlahMatkul = sc.nextInt();
            if (jumlahMatkul < 0) System.out.println("Jumlah Mata Kuliah Tidak Valid!");
            else break;
        }
        sks = new int[jumlahMatkul];
        semester = new int[jumlahMatkul];
        matkul = new String[jumlahMatkul];
        hari = new String[jumlahMatkul];
        sc.nextLine();
        System.out.println("==========================");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("Masukkan Nama Mata Kuliah ke-%s: ", i + 1);
            matkul[i] = sc.nextLine();
            System.out.println("==========================");
            System.out.printf("Masukkan Jumlah SKS Mata Kuliah ke-%s: ", i + 1);
            sks[i] = sc.nextInt();
            System.out.println("==========================");
            System.out.printf("Masukkan Semester Mata Kuliah ke-%s: ", i + 1);
            semester[i] = sc.nextInt();
            System.out.println("==========================");
            sc.nextLine();
            System.out.printf("Masukkan Jadwal Hari Mata Kuliah ke-%s: ", i + 1);
            hari[i] = sc.nextLine();
            System.out.println("==========================");
        }
    }
    static void printData(String matkul, int sks, int semester, String hari) {
        System.out.printf("Mata Kuliah: %s\n", matkul);
        System.out.printf("SKS: %s\n", sks);
        System.out.printf("Semester: %s\n", semester);
        System.out.printf("Hari: %s\n", hari);
        System.out.println("=============================");
    }

    static void tampilJadwal() {
        boolean isEmpty = validateJml();
        if (isEmpty){
            System.out.println("Input Data Terlebih Dahulu!");
            return;
        }
        System.out.println("=============================");
        System.out.println("Seluruh Jadwal Mata Kuliah");
        System.out.println("=============================");
        for (int i = 0; i < jumlahMatkul; i++) {
            printData(matkul[i], sks[i], semester[i], hari[i]);
        }
    }

    static void tampilHari() {
        boolean isEmpty = validateJml();
        if (isEmpty){
            System.out.println("Input Data Terlebih Dahulu!");
            return;
        }
        sc.nextLine();
        System.out.print("Masukkan Hari: ");
        String input = sc.nextLine();
        boolean isFound = false;
        System.out.printf("========== Mata Kuliah Hari %s ==========\n", input);
        for (int i = 0; i < jumlahMatkul; i++) {
            if (hari[i].equalsIgnoreCase(input)) {
                isFound = true;
                printData(matkul[i], sks[i], semester[i], hari[i]);
            }
        }
        if (!isFound) System.out.println("Mata Kuliah Tidak Ditemukan\n");
    }

    static void tampilSemester() {
        boolean isEmpty = validateJml();
        if (isEmpty){
            System.out.println("Input Data Terlebih Dahulu!");
            return;
        }
        System.out.print("Masukkan Semester: ");
        int input = sc.nextInt();
        sc.nextLine();
        System.out.printf("========== Mata Kuliah Semester %s ==========\n", input);
        boolean isFound = false;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (semester[i] == input) {
                isFound = true;
                printData(matkul[i], sks[i], semester[i], hari[i]);
            }
        }
        if (!isFound)System.out.println("Mata Kuliah Tidak Ditemukan\n");
    }

    static void tampilMatkul() {
        boolean isEmpty = validateJml();
        if (isEmpty){
            System.out.println("Input Data Terlebih Dahulu!");
            return;
        }
        sc.nextLine();
        System.out.print("Masukkan Mata Kuliah: ");
        String input = sc.nextLine();
        System.out.printf("========== Mata Kuliah Semester %s ==========\n", input);
        boolean isFound = false;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (matkul[i].equalsIgnoreCase(input)) {
                isFound = true;
                printData(matkul[i], sks[i], semester[i], hari[i]);
            }
        }
        if (!isFound) System.out.println("Mata Kuliah Tidak Ditemukan\n");
    }

    public static void main(String[] args) {
        menu();
    }
}
