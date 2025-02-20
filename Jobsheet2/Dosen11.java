package Jobsheet2;

public class Dosen11 {
    String idDosen,nama,bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen11(){
    }
    public Dosen11(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("=============== Informasi Dosen ===============");
        System.out.printf("ID Dosen: %s\n", idDosen);
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("Status Aktif: %s\n", statusAktif);
        System.out.printf("Tahun Bergabung: %s\n", tahunBergabung);
        System.out.printf("Bidang Keahlian: %s\n", bidangKeahlian);
        System.out.printf("Lama Masa Kerja: %s tahun\n", hitungMasaKerja(2025));
        System.out.println("===============================================");
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}