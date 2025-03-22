package Jobsheet6;

public class DataDosen11 {
    Dosen11 [] dataDosen = new Dosen11[10];
    int idx;

    void tambah(Dosen11 dsn){
        if (idx<dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else System.out.println("Data sudah penuh");
    }
    void tampil(){
        for (Dosen11 dosen : dataDosen) {
            dosen.tampil();
            System.out.println("--------------------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia<dataDosen[j-1].usia) {
                    Dosen11 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen11 temp = dataDosen[i];
            int j = i;
            while (j>0 && temp.usia>dataDosen[j-1].usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
