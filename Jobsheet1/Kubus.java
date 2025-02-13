import java.util.Scanner;

public class Kubus {
    static Scanner sc = new Scanner(System.in);
    static void menu(){
        byte menu;
        do{
            System.out.println("=========================");
            System.out.println("Menu Operasi Kubus");
            System.out.println("=========================");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Menu: ");
            menu = sc.nextByte();

            switch (menu) {
                case 1:
                    volume();
                    break;
                case 2:
                    lPermukaan();
                    break;
                case 3:
                    keliling();
                    break;
                case 4:
                    System.out.println("Program Selesai!");
                    break;
                default:
                    System.out.println("Input Menu Tidak Valid!");
                    break;
            }
        } while(menu!=4);
    }
    static void volume(){
        short rusuk;
        int volume;
        System.out.print("Input Panjang Rusuk Kubus: ");
        rusuk = sc.nextShort();
        volume = rusuk * rusuk * rusuk;
        System.out.printf("Panjang Rusuk Kubus = %s\n",rusuk);
        System.out.printf("Volume Kubus = %s\n\n",volume);
    }
    static void lPermukaan(){
        short rusuk;
        int lp;
        System.out.print("Input Panjang Rusuk Kubus: ");
        rusuk = sc.nextShort();
        lp = 6 * (rusuk * rusuk);
        System.out.printf("Panjang Rusuk Kubus = %s\n",rusuk);
        System.out.printf("Luas Permukaan Kubus = %s\n\n",lp);
    }
    static void keliling(){
        short rusuk;
        int keliling;
        System.out.print("Input Panjang Rusuk Kubus: ");
        rusuk = sc.nextShort();
        keliling = 12 * rusuk;
        System.out.printf("Panjang Rusuk Kubus = %s\n",rusuk);
        System.out.printf("Keliling Kubus = %s\n\n",keliling);
    }
    public static void main(String[] args) {
        menu();
    }
}
