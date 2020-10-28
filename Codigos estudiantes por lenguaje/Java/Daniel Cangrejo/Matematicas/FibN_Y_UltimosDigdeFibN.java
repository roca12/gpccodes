public class Main {
    
    static void mutiply(long[][]F, long [][]M) {
        long x = F[0][0] * M[0][0]
                + F[0][1] * M[1][0];
        long y = F[0][0] * M[0][1]
                + F[0][1] * M[1][1];
        long z = F[1][0] * M[0][0]
                + F[1][1] * M[1][0];
        long w = F[1][0] * M[0][1]
                + F[1][1] * M[1][1];
        F[0][0]=x;
        F[0][1]=y;
        F[1][0]=z;
        F[1][1]=w;
    }
    
    static void power (long[][] F, long n) {
        if (n==0||n==1) {
            return;
        }
        long M[][]= new long [][] {{1,1},{1,0}};
        power(F, n/2);
        mutiply(F,F);
        if (n%2!=0) {
            mutiply(F,M);
        }
    }
    
    static long fib(long n) {
        long F [][]=new long [][] {{1,1},{1,0}};
        if (n==0) {
            return 0;
        }
        power (F, n-1);
        return F[0][0];
    }
    
    static long findLastDigit(long n) {
        return fib(n)%1000;//Si quiero obtener más del último digito aumentar ceros
    }
    
    public static void main(String[] args) {
        int n=50;//Numero de Fibonacci
        System.out.println(fib(n));//Encuentra el fibonacci
        System.out.println(findLastDigit(n));//Ultimo digito del Fibonacci n
        
    }
    
}
