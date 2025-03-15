package Jobsheet4;

public class Faktorial {
    int faktorialBF(int n){
        int fakto = 1;
        // w/ for loop
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        // w/ while loop
        // int index = 1;
        // while (index <= n) {
        //     fakto = fakto * index;
        //     index++;
        // }
        return fakto;
    }
    int faktorialDC(int n){
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}