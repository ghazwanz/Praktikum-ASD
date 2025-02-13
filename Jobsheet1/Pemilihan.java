import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas: ");
        byte tugas = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis: ");
        byte kuis = sc.nextByte();

        System.out.print("Masukkan Nilai UTS: ");
        byte uts = sc.nextByte();

        System.out.print("Masukkan Nilai UAS: ");
        byte uas = sc.nextByte();

        sc.close();
        System.out.println("======================");
        System.out.println("======================");

        boolean isValid;
        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100)
            isValid = true;
        else isValid = false;

        if (isValid) {
            float rataRata = (tugas * 0.2f) + (kuis * 0.2f) + (uts * 0.3f) + (uas * 0.3f);
            String nilaiHuruf;
            if (rataRata <= 100 && rataRata > 80) nilaiHuruf = "A";
            else if (rataRata <= 80 && rataRata > 73) nilaiHuruf = "B+";
            else if (rataRata <= 73 && rataRata > 65) nilaiHuruf = "B+";
            else if (rataRata <= 65 && rataRata > 60) nilaiHuruf = "C+";
            else if (rataRata <= 60 && rataRata > 50) nilaiHuruf = "C";
            else if (rataRata <= 50 && rataRata > 39) nilaiHuruf = "D";
            else if (rataRata <= 39 && rataRata >= 0) nilaiHuruf = "E";
            else nilaiHuruf = "nilai tidak valid";
            System.out.printf("Nilai Akhir: %.1f\n", rataRata);
            System.out.printf("Nilai Huruf: %s\n", nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            boolean isLulus;
            if (nilaiHuruf.equalsIgnoreCase("D") || nilaiHuruf.equalsIgnoreCase("E")) {
                isLulus = false;
            } else isLulus = true;
            if (isLulus)
                System.out.println("SELAMAT ANDA LULUS");
            else
                System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("Nilai Tidak Valid");
            System.out.println("======================");
            System.out.println("======================");
        }
    }
}