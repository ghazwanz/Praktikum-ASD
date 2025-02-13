import java.util.Scanner;

public class Fungsi {
    static Scanner sc = new Scanner(System.in);
    static void pendapatan(int[][]cabang){
        for (int i = 0; i < cabang.length; i++) {
            int total = 0;
            for (int j = 0; j < cabang[i].length; j++) {
                int totalHarga=0;
                switch (j) {
                    case 0:
                        totalHarga = cabang[i][j] * 75000;
                        break;
                    case 1:
                        totalHarga = cabang[i][j] * 50000;
                        break;
                    case 2:
                        totalHarga = cabang[i][j] * 60000;
                        break;
                    case 3:
                        totalHarga = cabang[i][j] * 10000;
                        break;
                }
                total+= totalHarga;
            }
            System.out.printf("Total Pendapatan Royal Garden %s = %s\n",i+1,total);
            System.out.println("=========================");
        }
    }
    static void stok(int[][]cabang){
        boolean isPengurangan = false;
        while (true) {
            System.out.print("Apakah Terdapat Pengurangan Pada Cabang ke-4? (ya/tidak): ");
            String pengurangan = sc.nextLine();
            if (pengurangan.equalsIgnoreCase("tidak")) isPengurangan = false; 
            else if(pengurangan.equalsIgnoreCase("ya")) isPengurangan =true;
            if (pengurangan.equalsIgnoreCase("ya")||pengurangan.equalsIgnoreCase("tidak")) {
                break;
            } else System.out.println("Input Tidak Valid");
        }
        for (int i = 0; i < cabang.length; i++) {
            int stok =0;
            for (int j = 0; j < cabang[0].length; j++) {
                stok+= cabang[j][i];
                if (isPengurangan) {
                    if (j == cabang.length-1) {
                        switch (i) {
                            case 0:
                                stok -=1;
                                break;
                            case 1:
                                stok -=2;
                                break;
                            case 2:
                                stok -=1;
                                break;
                            case 3:
                                stok -=5;
                                break;
                        }
                    }                    
                }
            }
            switch (i) {
                case 0:
                    System.out.printf("Total Stok Bunga Aglonema = %s\n",stok);
                    break;
                case 1:
                    System.out.printf("Total Stok Bunga Keladi = %s\n",stok);
                    break;
                case 2:
                    System.out.printf("Total Stok Bunga Alocasia = %s\n",stok);
                    break;
                case 3:
                    System.out.printf("Total Stok Bunga Mawar = %s\n",stok);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[][] royalGarden = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        byte menu;
        do{
            System.out.println("==============================");
            System.out.println("Pendataan Royal Garden");
            System.out.println("==============================");
            System.out.println("1. Data Pendapatan Tiap Cabang");
            System.out.println("2. Data Stok Tiap Jenis Bunga");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Menu: ");
            menu = sc.nextByte();
            sc.nextLine();
            switch (menu) {
                case 1:
                    pendapatan(royalGarden);
                    break;
                case 2:
                    stok(royalGarden);
                    break;
                case 3:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu Tidak Valid!");
                    break;
            }
        } while(menu !=3);
    }
}
