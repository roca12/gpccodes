//Encuentra un x tal que para cada i : x es congruente con A_i mod M_i
//Devuelve un vector con dos posiciones donde [0] = x  &&  [1] = lcm 
//donde x es la solución con modulo lcm (lcm = LCM(M_0, M_1, ...)). 
//Dado un k : x + k*lcm es solución tambien.
//Si la solución no existe o la entrada no es válida devuelve {-1, -1}

import java.util.ArrayList;

public class ChineseRemainder {

    static int[] crt(ArrayList<Integer> A, ArrayList<Integer> M) {
        int n = A.size(), ans = A.get(0), lcm = M.get(0);
        for (int i = 1; i < n; i++) {
            int d = euclid(lcm, M.get(i));
            if (((A.get(i) - ans) % d) == 1) {
                int y[] = {-1, -1};
                return y;
            }
            int mod = lcm / d * M.get(i);
            ans = (ans + x * (A.get(i) - ans) / d % (M.get(i) / d) * lcm) % mod;
            if (ans < 0) {
                ans += mod;
            }
            lcm = mod;
        }
        int y[] = {ans, lcm};
        return y;
    }
    static int x, y;

    static int euclid(int a, int b) {
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }
        int d = euclid(b, a % b);
        int temp = x;
        x = y;
        y = temp - ((a / b) * y);
        return d;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(7);
        ArrayList<Integer> rem = new ArrayList<>();
        rem.add(1);
        rem.add(3);
        int[] res = crt(num, rem);
        for (int re : res) {
            System.out.print(re+ " ");
        }
    }
}
