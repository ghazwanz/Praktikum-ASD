package Jobsheet13;
public class BinaryTreeMain11 {
    public static void main(String[] args) {
        BinaryTree11 bst = new BinaryTree11();
        bst.add(new Mahasiswa11("244160121","Ali","A",3.57));
        bst.add(new Mahasiswa11("244160221","Badar","B",3.85));
        bst.add(new Mahasiswa11("244160185","Candra","C",3.21));
        bst.add(new Mahasiswa11("244160220","Dewi","B",3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal) :");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa11("244160131","Devi","A",3.72));
        bst.add(new Mahasiswa11("244160205","Ehsan","D",3.37));
        bst.add(new Mahasiswa11("244160170","Fizi","B",3.46));
        Mahasiswa11 mhs = new Mahasiswa11("244160199","Loki","B",4.00);
        bst.addRekursif(bst.root,new Node11(mhs));
        bst.addRekursif(bst.root,new Node11(mhs)); // duplicate data, tidak akan ditambahkan
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal: ");
        bst.traverseInOrder(bst.root);
        System.out.println("PreOrder Traversal: ");
        bst.traversePreOrder(bst.root);
        System.out.println("PostOrder Traversal: ");
        bst.traversePostOrder(bst.root);

        System.out.println("Penghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        bst.cariMaxIPK(bst.root);
        bst.cariMinIPK(bst.root);
        System.out.println();
        bst.tampilMahasiswaIPKdiAtas(bst.root, 3.50);
    }
}
