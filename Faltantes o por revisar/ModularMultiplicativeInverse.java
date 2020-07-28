// Java program to find modular inverse  
// of a under modulo m 

public class ModularMultiplicativeInverse {

    // A naive method to find modulor  
    // multiplicative inverse of 'a'  
    // under modulo 'm' 
    static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return 1;
    }

    // Driver Program 
    public static void main(String args[]) {
        int a = 3, m = 11;
        System.out.println(modInverse(a, m));
    }
}
