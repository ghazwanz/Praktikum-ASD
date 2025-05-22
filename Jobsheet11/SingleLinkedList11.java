package Jobsheet11;

public class SingleLinkedList11 {
    Node11 head;
    Node11 tail;


    boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
        Node11 tmp = head;
        System.out.println("Isi Linked List:\t");
        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void addFirst(Mahasiswa11 input){
        Node11 nodeInput = new Node11(input, null);
        if(isEmpty()){
            head = nodeInput;
            tail = nodeInput;
        }else{
            nodeInput.next = head;
            head = nodeInput;
        }
    }

    public void addLast(Mahasiswa11 input){
        Node11 nodeInput = new Node11(input, null);
        if(isEmpty()){
            head = nodeInput;
            tail = nodeInput;
        }else{
            tail.next = nodeInput;
            tail = nodeInput;
        }
    }

    public void insertAfter(String key, Mahasiswa11 input){
        Node11 nodeInput = new Node11(input, null);
        Node11 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                nodeInput.next = temp.next;
                temp.next = nodeInput;
                if (nodeInput.next == null) tail = nodeInput;
                break;
            }
            temp= temp.next;
        } while (temp.next != null);
    }

    public void insertAt(int index, Mahasiswa11 input){
        if (index <0) System.out.println("Indeks salah");
        else if(index == 0) addFirst(input);
        else {
            Node11 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node11(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public void getData(int index){
        Node11 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public int indexOf(String key){
        Node11 temp = head;
        int index = 0;
        while(temp!=null && !temp.data.nama.equalsIgnoreCase(key)){
            temp = temp.next;
            index++;
        }
        if (temp == null) return -1;
        return index;
    }

    public void removeFirst(){
        if(isEmpty()) System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        else if(head == tail) head = tail = null;
        else head = head.next;
    }

    public void removeLast(){
        if(isEmpty()) System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        else if(head == tail) head = tail = null;
        else{
            Node11 temp = head;
            while (temp.next != tail) temp = temp.next;
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key){
        if(isEmpty())System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        else{
            Node11 temp = head;
            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key) && temp == head) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) tail = temp;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0) removeFirst();
        else{
            Node11 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
        }
    }
}