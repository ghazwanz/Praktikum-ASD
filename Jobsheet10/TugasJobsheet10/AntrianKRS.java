package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa11 dataMhs[];
    int front, rear, size, max, counter, maxCounter;

    public AntrianKRS(int n) {
        this.max = n;
        dataMhs = new Mahasiswa11[max];
        size = counter = 0;
        front = rear = -1;
        maxCounter = 30;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void lihat2AntrianTerdepan(){
        if (isEmpty()) System.out.println("Antrian masih kosong");
        else if (size > 1) {
            int prosesMhs = 2;
            System.out.println("Antrian Terdepan: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            for (int i = 0; i < prosesMhs; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                dataMhs[index].tampilkanData();
            }
        }
        else System.out.println("Antrian hanya ada 1 mahasiswa");
    }

    public void lihatAntrian(){
        if (isEmpty()) System.out.println("Queue masih kosong");
        else {
            System.out.println("Daftar Antrian: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            int i = front;
            while (i != rear) {
                System.out.print((i+1) + ". ");
                dataMhs[i].tampilkanData();
                i = (i + 1) % max;
            }
            System.out.print((i+1) + ". ");
            dataMhs[i].tampilkanData();
        }
    }

    public void lihatAntrianAkhir(){
        if (isEmpty()) System.out.println("Antrian masih kosong");
        else {
            System.out.println("Antrian Paling Belakang: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            dataMhs[rear].tampilkanData();
        };
    }

    public void tambahAntrian(Mahasiswa11 mhs){
        if (isFull()) System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        else {
            if(isEmpty()) front = rear = 0;
            else rear = (rear + 1) % max;
            dataMhs[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " Berhasil ditambahkan ke antrian.");
        };
    }

    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian Berhasil dikosongkan");
        } else System.out.println("Antrian masih kosong");
    }

    public Mahasiswa11[] prosesKRSMhs(){
        Mahasiswa11 mhs[] = new Mahasiswa11[2];
        int prosesMhs = 2;
        if (isEmpty()) System.out.println("Queue masih kosong");
        if(size < prosesMhs) System.out.println("Antrian Mahasiswa Kurang dari 2");
        else if(counter >= maxCounter) System.out.println("DPA hanya dapat melayani maksimal 30 mahasiswa");
        else {
            for (int i = 0; i < prosesMhs; i++) {
                mhs[i] = dataMhs[front];
                size--;
                front = (front + 1) % max;
                counter++;
            }
            if (isEmpty()) front = rear = -1;
        }
        return mhs;
    }

    public int getJumlahAntrian(){
        return size;
    }
    public int getMhsSudahKRS(){
        return counter;
    }
    public int getMhsBelumKRS(){
        return maxCounter-counter;
    }
}
