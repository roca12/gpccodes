//Codigo Java

import java.util.*;

public class Main {

    static int min(int x, int y) {
        return (x <= y) ? x : y;
    }

    static int fiboSearch(int arr[], int x, int n) {
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = fib1 + fib2;
        while (fib3 < n) {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib2 + fib1;
        }
        int offset = -1;
        while (fib3 > 1) {
            int i = min(offset + fib1, n - 1);
            if (arr[i] < x) {
                fib3 = fib2;
                fib2 = fib1;
                fib1 = fib3 - fib2;
                offset = i;
            } else if (arr[i] > x) {
                fib3 = fib1;
                fib2 = fib2 - fib1;
                fib1 = fib3 - fib2;
            } else {
                return i;
            }
        }
        if (fib2 == 1 && arr[offset + 1] == x) {
            return offset + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100};
        int n = arr.length;
        int x = 85;
        System.out.println(fiboSearch(arr, x, n));
    }
}
