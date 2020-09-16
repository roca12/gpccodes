

//El inverso multiplicativo modular de a % mod es un entero 
//b tal que (a*b) % mod = 1. Éste existe siempre y cuando a 
//y mod sean coprimos (gcd(a, mod) = 1).
//El inverso modular de a se utiliza para calcular (n/a) % mod como (n*b) % mod.

public class ModularInverse {

    public static long modInverse(int a, int mod) {
        long d = extendedEuclid(a, mod);
        if (d > 1) {
            return -1;
        }
        return (x % mod + mod) % mod;
    }

// Si mod es un número primo, se puede calcular 
//aplicando el pequeño teorema de Fermat. 
//agregar Modular Exponentiation.
//public static long modInverse(int a, int mod) {
//    return modpow(a, mod - 2, mod);
//}
//* Calcular el inverso modular
//para todos los numeros menores a mod.
    static int inv[];

    public static void modInverse(int mod) {
        inv = new int[mod];
        inv[1] = 1;
        for (int i = 2; i < mod; i++) {
            inv[i] = (mod - (mod / i) * inv[mod % i] % mod) % mod;
        }
    }
//El algoritmo de Euclides extendido retorna el 
//gcd(a, b) y calcula los coeficientes enteros 
//X y Y que satisfacen la ecuación: a*X + b*Y = gcd(a, b).

    static int x, y;
/// O(log(max(a, b)))

    static int extendedEuclid(int a, int b) {
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }
        int d = extendedEuclid(b, a % b);
        int aux = x;
        x = y;
        y = aux - ((a / b) * y);
        return d;
    }

    public static void main(String[] args) {
        System.out.println(modInverse(3, 7));
    }
}
