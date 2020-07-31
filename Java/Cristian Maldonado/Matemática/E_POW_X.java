public class E_POW_X {
    
    static double exp(int n, double x) {
        double sum = 1;
        for (int i = n - 1; i > 0; i--) {
            sum = 1 + x * sum / i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 10;
        double x = 2;
        System.out.println("exp: " + exp(n, x));
        System.out.println("exp: " + exp(n + 10, x));
    }  
}
