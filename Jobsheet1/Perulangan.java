import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();
        System.out.println("=====================");

        String digitNim = nim.substring(nim.length()-2);

        int n = Integer.parseInt(digitNim);
        if (n < 10) n+=10;
        System.out.printf("n=%s\n",n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue;
            if (i % 2 != 0) System.out.print("* ");
            else System.out.print(i+" ");
        }
    }    
}