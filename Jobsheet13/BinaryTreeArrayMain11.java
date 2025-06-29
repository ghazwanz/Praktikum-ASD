package Jobsheet13;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {
        BinaryTreeArray11 bta = new BinaryTreeArray11();
        Mahasiswa11 mhs1 = new Mahasiswa11("244160121","Ali","A",3.57);
        Mahasiswa11 mhs2 = new Mahasiswa11("244160185","Candra","C",3.41);
        Mahasiswa11 mhs3 = new Mahasiswa11("244160221","Badar","B",3.75);
        Mahasiswa11 mhs4 = new Mahasiswa11("244160220","Dewi","B",3.35);
        
        Mahasiswa11 mhs5 = new Mahasiswa11("244160131","Devi","A",3.48);
        Mahasiswa11 mhs6 = new Mahasiswa11("244160205","Ehsan","D",3.61);
        Mahasiswa11 mhs7 = new Mahasiswa11("244160170","Fizi","B",3.86);
        Mahasiswa11 mhs8 = new Mahasiswa11("244160199","Loki","B",4.00);
        Mahasiswa11 mhs9 = new Mahasiswa11("244160190","Lapet","B",3.99);
        Mahasiswa11 mhs10 = new Mahasiswa11("244160200","Maya","B",3.95);
        Mahasiswa11 mhs11 = new Mahasiswa11("244160210","Nina","B",3.80);


        // Mahasiswa11[] dataMahasiswas = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        // int idxLast = 6;
        // bta.populateData(dataMahasiswas, idxLast);
        
        // tugas
        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs6); // duplicate data, tidak akan ditambahkan
        bta.add(mhs7);
        bta.add(mhs8); // overflow size array, tidak akan ditambahkan
        bta.add(mhs9); // overflow size array, tidak akan ditambahkan
        bta.add(mhs10); // overflow size array, tidak akan ditambahkan
        bta.add(mhs11); // overflow size array, tidak akan ditambahkan
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traveseInOrder(0);
        System.out.println("\nPreorder Traversal Mahasiswa: ");
        bta.travesePreOrder(0);
    }
}
