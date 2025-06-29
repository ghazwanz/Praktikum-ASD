package Jobsheet13;
public class BinaryTree11 {
    Node11 root;

    BinaryTree11(){};
    
    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa11 mahasiswa){
        Node11 newNode = new Node11(mahasiswa);
        if (isEmpty()) root = newNode;
        else{
            Node11 current = root;
            Node11 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        return;
                    } 
                } else{
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find (double ipk){
        boolean result = false;
        Node11 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }
            if (ipk > current.mahasiswa.ipk) current = current.right;
            else current = current.left;
        }
        return result;
    }

    void traversePreOrder(Node11 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traverseInOrder(Node11 node){
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node11 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node11 getSuccessor(Node11 del){
        Node11 successor = del.right;
        Node11 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;            
        }
        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;
        // Traverse to find correct node
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) break;
            if (current.mahasiswa.ipk < ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
            if (current.mahasiswa.ipk > ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        // node is leaf condition
        else if (current.left == null && current.right == null) {
            if (current == root) root = null;
            else if (isLeftChild) parent.left = null;
            else parent.right = null;   
        }

        // node has child (right only)
        else if (current.left == null) {
            if (current == root) root = current.right;
            else if (isLeftChild) parent.left = current.right;
            else parent.right = current.right;
            
        }

        // node has child (left only)
        else if (current.right == null) {
            if (current == root) root = current.left;
            else if (isLeftChild) parent.left = current.left;
            else parent.right = current.left;
        }

        else{
            Node11 successor = getSuccessor(current);
            System.out.println("Jika 2 anak, current = ");
            successor.mahasiswa.tampilInformasi();
            if (current == root) root = successor;
            else if(isLeftChild) parent.left = successor;
            else parent.right = successor;
            successor.left = current.left;
        }
    }

    public void addRekursif(Node11 current, Node11 newNode){
        if (isEmpty()) {
            root = newNode;
            return;
        }
        if (current != null && current.mahasiswa.ipk == newNode.mahasiswa.ipk) {
            System.out.println("Data mahasiswa dengan IPK " + newNode.mahasiswa.ipk + " sudah ada, tidak bisa ditambahkan.");
            return;
        }
        Node11 parent = current;
        if (newNode.mahasiswa.ipk < current.mahasiswa.ipk) {
            if (current.left == null) {
                parent.left = newNode;
                return;
            }
            addRekursif(current.left, newNode);
        } else {
            if (current.right == null) {
                parent.right = newNode;
                return;
            }
            addRekursif(current.right, newNode);
        }
    }

    public void cariMinIPK(Node11 current){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        if (current.left == null) {
            System.out.println("Mahasiswa dengan IPK Terendah: ");
            current.mahasiswa.tampilInformasi();
        }
        else cariMinIPK(current.left);
    }

    public void cariMaxIPK(Node11 current){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        if (current.right == null) {
            System.out.println("Mahasiswa dengan IPK Tertinggi: ");
            current.mahasiswa.tampilInformasi();            
        }
        else cariMaxIPK(current.right);
    }

    public void tampilMahasiswaIPKdiAtas(Node11 current,double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        if (current != null) {
            if (current.mahasiswa.ipk > ipk) {
                current.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(current.left, ipk);
            tampilMahasiswaIPKdiAtas(current.right, ipk);
        }
    }

}
