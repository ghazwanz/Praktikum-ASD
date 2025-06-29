package Jobsheet13;
public class Mahasiswa11 {
    String nim,nama,kelas;
    double ipk;
    Mahasiswa11(){}
    Mahasiswa11(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi(){
        System.out.printf("NIM: %s Nama: %s Kelas: %s IPK: %s\n",this.nim,this.nama,this.kelas,this.ipk);
    }
}
