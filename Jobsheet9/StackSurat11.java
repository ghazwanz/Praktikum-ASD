package Jobsheet9;

public class StackSurat11 {
    Surat11[] stack;
    int top,size;

    StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Surat11 surat) {
        if (isFull()) 
            System.out.println("Stack penuh, surat tidak bisa ditambahkan " + surat.idSurat);
        else {
            stack[++top] = surat;
            System.out.println("surat " + surat.idSurat + " berhasil ditambahkan ke stack");
        }
    }

    Surat11 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada surat yang bisa diambil");
            return null;
        } else {
            return stack[top--];
        }
    }

    Surat11 peek() {
        if (isEmpty()){
            System.out.println("Stack kosong, tidak ada surat yang bisa dilihat");
            return null;
        }
        else return stack[top];
    }

    Surat11 searchStack(String mhs) {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada surat yang bisa dicari");
            return null;
        }
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equals(mhs))
                return stack[i];
        }
        System.out.println("Surat dengan nama " + mhs + " tidak ditemukan di stack");
        return null;
    }
}
