package Jobsheet9;

public class StackTugasMahasiswa11 {
    Mahasiswa11[] stack;
    int size,top;

    StackTugasMahasiswa11(int size){
        this.size = size;
        stack = new Mahasiswa11[size];
        top = -1;
    }

    boolean isFull(){
        return top == size -1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    void push (Mahasiswa11 mhs){
        if (!isFull()) stack[++top] = mhs;
        else System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
    }

    Mahasiswa11 pop(){
        if(top != -1){
            Mahasiswa11 m = stack[top];
            top--;
            return m;
        }else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa11 peek(){
        if (!isEmpty()) return stack[top];
        else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    Mahasiswa11 peekBottom(){
        if (!isEmpty()) return stack[0];
        else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    int totalTugas(){
        return top + 1;
    }

    void print(){
        for (int i = top; i >=0 ; i--) {
            System.out.printf("%s \t %s \t %s",stack[i].nama,stack[i].nim,stack[i].kelas);
            System.out.println();
        }
        System.out.println();
    }

    String konversiDesimalKeBiner(int nilai){
        StackKonversi11 stack = new StackKonversi11();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) 
            biner += stack.pop();
        return biner;
    }
}
