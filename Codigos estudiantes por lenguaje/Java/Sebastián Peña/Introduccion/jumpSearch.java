//Codigo Java

import java.util.*;

public class Main {

    static int jumpSearch(int arr[], int x){
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(step, n)]-1 < x) {            
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }
        while (arr[prev] < x) {            
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }
        if (arr[prev] == x) {
            return prev;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100};
        int n = arr.length;
        int x = 85;
        System.out.println(jumpSearch(arr, x));
    }
}
