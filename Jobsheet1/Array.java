import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = new String[8];
        float[] nilaiAngka = new float[8];
        String[] nilaiHuruf = new String[8];
        float[] bobotNilai = new float[8];
        byte[] sks = new byte[8];
        float ip=0;
        byte totalSks=0;
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            mataKuliah[i] = sc.nextLine();
        }
        System.out.println("======================");
        for (int i = 0; i < sks.length; i++) {
            while (true) {
                System.out.printf("Masukkan Bobot SKS untuk MK %s: ", mataKuliah[i]);
                sks[i] = sc.nextByte();
                if (sks[i] < 0 || sks[i] > 3) {
                    System.out.println("Input SKS Tidak Valid Input Ulang SKS!");
                } else break;
            }
            totalSks += sks[i];
        }
        System.out.println("======================");
        for (int i = 0; i < nilaiAngka.length; i++) {
            while (true) {
                System.out.printf("Masukkan Nilai Angka untuk MK %s: ", mataKuliah[i]);
                nilaiAngka[i] = sc.nextFloat();
                if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                    System.out.println("Input Nilai Tidak Valid Input Ulang Nilai!");
                } else break;
            }
            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73){
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5f;
            }
            else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65){
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            }
            else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60){
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5f;
            }
            else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50){
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            }
            else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39){
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            }
            else if (nilaiAngka[i] <= 39 && nilaiAngka[i] >= 0){
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK\t\t\t\t\tNilai Angka\t Nilai Huruf\tBobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-45s %-15.2f %-15s %.2f\n",mataKuliah[i],nilaiAngka[i],nilaiHuruf[i],bobotNilai[i]);

        }
        System.out.println("======================");
        for (int i = 0; i < mataKuliah.length; i++) {
            ip += (bobotNilai[i] * sks[i]);
        }
        ip = ip / totalSks;
        System.out.println("IP: "+ip);
    }
}
