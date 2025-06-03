package Jobsheet12;

public class DoubleLinkedList11 {
    Node11 head, tail;
    int size;
    public DoubleLinkedList11(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa11 data){
        Node11 newNode = new Node11(data);
        if (isEmpty()) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa11 data){
        Node11 newNode = new Node11(data);
        if (isEmpty()) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa11 data){
        Node11 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.printf("Node dengan NIM %s tidak ditemukan. \n", keyNim);
            return;
        }

        Node11 newNode = new Node11(data);
        if (current == tail) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else{
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("List kosong. Tambahkan data terlebih dahulu.");
            return;
        }
        Node11 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

        public Node11 search(String nim){
        Node11 current = head;
        while (current != null && !current.data.nim.equals(nim)){
            current = current.next;
        }
        if(current == null) return null;
        else return current;
    }

    public void removeFirst(){
        Node11 removedData;
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        removedData = head;
        if (head == tail) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        removedData.data.tampil();
    }
    
    public void removeLast(){
        Node11 removedData;
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        removedData = tail;
        if (head == tail) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        removedData.data.tampil();
    }

    public void add(int index, Mahasiswa11 data){
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (isEmpty() || index == 0) {
            addFirst(data);
            return;
        }
        Node11 newNode = new Node11(data);
        Node11 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Index berada di akhir atau melebihi ukuran, menambahkan di akhir.");
            addLast(data);
        } else {
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeAfter(String keyNim){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Node11 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.printf("Node dengan NIM %s tidak ditemukan. \n", keyNim);
            return;
        }
        if (head == tail) {
            System.out.println("Hanya ada satu node, tidak bisa dihapus setelahnya.");
            return;
        }
        if (current == tail) {
            System.out.println("Node terakhir tidak memiliki node setelahnya.");
            return;
        }
        
        Node11 removedData = current.next;
        current.next = removedData.next;
        if (removedData.next != null) removedData.next.prev = current;
        else {
            tail = current;
            tail.next = null;
        }
        size--;
        System.out.println("Node berhasil dihapus setelah NIM " + keyNim);
        System.out.println("Data yang terhapus adalah: ");
        removedData.data.tampil();
    }

    public void remove(int index){
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node11 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.printf("Node pada indeks %s kosong. \n", index);
            return;
        }
        if (current == tail) {
            removeLast();
            return;
        }
        else{
            Node11 removedData = current;
            current.next.prev = current.prev;
            current.prev.next = current.next;
            size--;
            System.out.printf("Node pada indeks %s berhasil dihapus.\n",index);
            System.out.println("Data yang terhapus adalah: ");
            removedData.data.tampil();
        }
    }

    public Node11 getFirst(){
        return head;
    }
    public Node11 getLast(){
        return tail;
    }
    public Node11 getIndex(int index){
        if (index < 0) {
            System.out.println("Index Tidak Valid");
            return null;
        }
        Node11 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public int getSize(){
        return size;
    }
}
