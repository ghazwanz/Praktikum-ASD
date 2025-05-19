package P2Jobsheet10;

public class AntrianLayanan11 {
    Mahasiswa11 data[];
    int front, rear, size, max;

    public AntrianLayanan11(int max) {
        this.max = max;
        data = new Mahasiswa11[max];
        size = front = 0;
        rear = -1; 
    }

    public void tambahAntrian(Mahasiswa11 mhs){
        if (isFull()) System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
        };
    }

    public Mahasiswa11 layaniMahasiswa(){
        Mahasiswa11 mhs = null;
        if (isEmpty()) System.out.println("Queue masih kosong");
        else {
            mhs = data[front];
            front = (front + 1) % max;
            size--;
        }
        return mhs;
    }

    public void lihatTerdepan(){
        if (isEmpty()) System.out.println("Antrian kosong");
        else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
        };
    }

    public void lihatAkhir(){
        if (isEmpty()) System.out.println("Antrian kosong");
        else {
            System.out.println("Mahasiswa di akhir antrian: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[rear].tampilkanData();
        };
    }

    public void tampilkanSemua(){
        if (isEmpty()) System.out.println("Queue masih kosong");
        else {
            System.out.println("Daftar Mahasiswa dalam Antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil dikosongkan");
        } else System.out.println("Queue masih kosong");
    }

    public int getJumlahAntrian(){
        return size;
    }
}