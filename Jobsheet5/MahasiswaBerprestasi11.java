package Jobsheet5;

public class MahasiswaBerprestasi11 {
    Mahasiswa11[] listMhs = new Mahasiswa11[5];
    int idx;

    void tambah(Mahasiswa11 mhs){
        if (idx<listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }else System.out.println("Data sudah penuh");
    }

    void tampil(){
        for (Mahasiswa11 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------------");
        }
    }
    
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa11 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
