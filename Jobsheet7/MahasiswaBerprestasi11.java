package Jobsheet7;

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

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa11 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa11 temp = listMhs[i];
            int j = i;
            while (j>0 && temp.ipk>listMhs[j-1].ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    int sequentialSearch(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        }else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
