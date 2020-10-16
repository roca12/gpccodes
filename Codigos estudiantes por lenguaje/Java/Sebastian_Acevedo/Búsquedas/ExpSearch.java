import java.util.*;

public class Main {
    static int exp_Search(int vec[], int n, int x) {
        if (vec[0] == x) {
            return 0;
        }
        int i = 1;
        while (i < n && vec[i] <= x) {
            i = i * 2;
        }
        return Arrays.binarySearch(vec, i / 2, Math.min(i, n), x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int vec[] = new int[c];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = exp_Search(vec, vec.length, x);
        System.out.println(
                (result < 0) ? "el elemento no esta presente en el array" : "el elemento se encuentra en: " + result);
    }
}
