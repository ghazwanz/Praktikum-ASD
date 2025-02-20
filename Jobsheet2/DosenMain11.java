package Jobsheet2;

public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 ds1 = new Dosen11();
        ds1.idDosen = "VIT";
        ds1.nama = "Vit Zuraida S.Kom., M.Kom.";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2020;
        ds1.bidangKeahlian = "Basis Data";
        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.tampilInformasi();

        Dosen11 ds2 = new Dosen11("SA", "Samsul Arifin", true, 2023,"Sistem Operasi");
        ds2.tampilInformasi();
    }    
}