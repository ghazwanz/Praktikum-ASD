package Jobsheet2;

public class MatakuliahMain11 {
    public static void main(String[] args) {
        Matakuliah11 mk1 = new Matakuliah11();
        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilkanInformasi();
        mk1.tambahJam(2);
        mk1.ubahSKS(4);
        mk1.tampilkanInformasi();
        mk1.kurangiJam(4);
        mk1.ubahSKS(2);
        mk1.tampilkanInformasi();
        mk1.tambahJam(-111);
        mk1.kurangiJam(-998);
        mk1.ubahSKS(-98234);
        mk1.tampilkanInformasi();

        Matakuliah11 mk2 = new Matakuliah11("BD_TI", "Basis Data", 2,4);
        mk2.tampilkanInformasi();
    }
}
