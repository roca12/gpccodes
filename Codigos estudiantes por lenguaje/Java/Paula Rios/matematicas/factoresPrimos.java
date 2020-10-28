public class Main {
    static void primeFactors(int N){
        for (long i = 2; i*i <=N; ++i) {
            while(N%i==0){
                System.out.println(i);
                N/=i;
            }
        }
        if(N>1){
            System.out.println(N);
        }
    }
    public static void main(String[] args) {
        int n=23;
        primeFactors(42);
    }
}
