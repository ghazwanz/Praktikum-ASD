package Jobsheet5;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
        Mahasiswa11 m1 = new Mahasiswa11("123", "Zidan", "2A", 3.2);
        Mahasiswa11 m2 = new Mahasiswa11("124", "Ayu", "2A", 3.5);
        Mahasiswa11 m3 = new Mahasiswa11("125", "Sofi", "2A", 3.1);
        Mahasiswa11 m4 = new Mahasiswa11("126", "Sita", "2A", 3.9);
        Mahasiswa11 m5 = new Mahasiswa11("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
