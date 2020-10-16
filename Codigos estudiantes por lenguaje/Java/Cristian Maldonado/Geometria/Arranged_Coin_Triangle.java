
public class Arranged_Coin_Triangle {

    static float squareRoot(float n) {
        float x = n;
        float y = 1;
        float e = 0.000001f;
        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }

    static int findMaximumHeight(int N) {
        int n = 1 + 8 * N;
        int maxH = (int) (-1 + squareRoot(n)) / 2;
        return maxH;
    }

    public static void main(String[] args) {
        int N = 12;
        System.out.println(findMaximumHeight(N));
    }
}
