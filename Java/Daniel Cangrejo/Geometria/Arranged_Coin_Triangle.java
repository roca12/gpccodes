public class main {
//Arranged_Coin_Triangle
    public static void main(String[] args) {
        int N=12;
        System.out.println(findMaxH(N));
    }
    static int findMaxH(int n) {
        int n1 = 1 + 8 * n;
        int maxh = (int) (-1 + squareRoot(n1) / 2);
        return maxh;
    }
    static float squareRoot(float n) {
        float x=n;
        float y=1;
        float e = 0.0000001f;
        while (x-y > e) {
            x= (x+y)/2;
            y=n/x;

        }
        return x;
    }
}
