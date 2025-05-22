package Jobsheet11;

public class AntrianSLL {
    Node11 head, tail;
    int size, max;

    public AntrianSLL(int max){
        head = tail = null;
        size = 0;
        this.max = max;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return size == max;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Antrian kosong\n");
            return;
        }
        Node11 tmp = head;
        System.out.println("Daftar Antrian:\t");
        while (tmp.next != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
        System.out.println();
    }

    public void addLast(Mahasiswa11 input){
        Node11 nodeInput = new Node11(input, null);
        if (isFull()) {
            System.out.println("Antrian sudah penuh\n");
            return;
        }
        else if(isEmpty()){
            head = tail = nodeInput;
            size++;
        }else{
            tail.next = nodeInput;
            tail = nodeInput;
            size++;
        }
        System.out.println("Mahasisswa berhasil ditambahkan\n");
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Antrian kosong\n");
            return;
        }
        Mahasiswa11 mhs = head.data;
        head = head.next;
        size--;
        if (isEmpty()) head = tail = null;
        mhs.tampilInformasi();
    }

    public void getHead(){
        if (isEmpty()) System.out.println("Antrian kosong\n");
        else {
            System.out.println("Antrian Terdepan: ");
            head.data.tampilInformasi();
        }
    }

    public void getTail(){
        if (isEmpty()) System.out.println("Antrian kosong\n");
        else {
            System.out.println("Data Paling Belakang: ");
            tail.data.tampilInformasi();
        }
    }

    public void getSize(){
        System.out.printf("Jumlah Antrian: %s\n\n",size);
    }

    public void clear(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong\n");
            return;
        }
        head = tail = null;
        size = 0;
        System.out.println("Antrian Berhasil Dikosongkan\n");
    }
}