import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte hasil = -1;
        char[] kodePlat = {'A','B','D','E','F','G','H','L','N','T'};
        char[][] kota = {{'B','A','N','T','E','N'},{'J','A','K','A','R','T','A'},{'B','A','N','D','U','N','G'},{'C','I','R','E','B','O','N'},{'B','O','G','O','R'},{'P','E','K','A','L','O','N','G','A','N'},{'S','E','M','A','R','A','N','G'},{'S','U','R','A','B','A','Y','A'},{'M','A','L','A','N','G'},{'T','E','G','A','L'}};
        System.out.print("Input Kode Plat Nomor: ");
        char input = sc.nextLine().charAt(0);

        for (int i = 0; i < kodePlat.length; i++) {
            if(input == kodePlat[i])hasil = (byte) i;
        }
        System.out.println(hasil);
        if (hasil != -1) System.out.println("Kode Tidak Ditemukan");
        else {
            for (int i = 0; i < kota.length; i++) {
                if (i == hasil) {
                    for (int j = 0; j < kota.length; j++) {
                        System.out.print(kota[i][j]);    
                    }
                }
            }
        }
    }
}
