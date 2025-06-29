package Jobsheet13;
public class Node11 {
    Mahasiswa11 mahasiswa;
    Node11 left, right;

    public Node11(){}
    
    public Node11(Mahasiswa11 mahasiswa){
        this.mahasiswa = mahasiswa;
        this.right = this.left = null;
    }    
}
