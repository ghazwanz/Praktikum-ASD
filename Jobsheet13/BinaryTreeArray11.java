package Jobsheet13;

public class BinaryTreeArray11 {
    Mahasiswa11[] dataMahasiswa;
    int idxLast;
    
    public BinaryTreeArray11(){
        this.dataMahasiswa = new Mahasiswa11[10];
    }

    void populateData(Mahasiswa11 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa11 mahasiswa) {
        int idx = 0;
        while (idx <= dataMahasiswa.length-1) {
            if (dataMahasiswa[idx]!=null && dataMahasiswa[idx].ipk == mahasiswa.ipk) {
                System.out.println("Data mahasiswa dengan IPK " + mahasiswa.ipk + " sudah ada, tidak bisa ditambahkan.");
                return;
            }
            if (dataMahasiswa[idx] == null) {
                dataMahasiswa[idx] = mahasiswa;
                idxLast = idx;
                return;
            }
            else if (mahasiswa.ipk < dataMahasiswa[idx].ipk) {
                idx = 2 * idx + 1;
            } else {
                idx = 2 * idx + 2;
            }
        }
    }
    
    void traveseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            if (dataMahasiswa[idxStart]!=null) {
                traveseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traveseInOrder(2*idxStart+2);
            }
        }
    }
    
    void travesePreOrder(int idxStart){
        if (idxStart<=idxLast) {
            if (dataMahasiswa[idxStart]!=null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traveseInOrder(2*idxStart+1);
                traveseInOrder(2*idxStart+2);
            }
        }
    }
}
