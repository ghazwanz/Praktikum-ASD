package P1Jobsheet10;
import java.util.Scanner;

public class QueueMain11 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue11 Q = new Queue11(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    boolean fullStatus = Q.isFull();
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    if(fullStatus) return;
                    break;
                case 2:
                    boolean emptyStatus = !Q.isEmpty();
                    int dataKeluar = Q.dequeue();
                    if (emptyStatus) System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    else return;
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >0 && pilih < 6);
    }
}
