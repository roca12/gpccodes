import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public
class Main
{
    static int NO_OF_CHARS = 256;
    static int getNextState(char[] pat, int M,
                            int state, int x)
    {
        if (state < M && x == pat[state])
        {
            return state + 1;
        }
        int ns, i;

        for (ns = state; ns > 0; ns--)
        {
            if (pat[ns - 1] == x)
            {
                for (i = 0; i < ns - 1; i++)
                {
                    if (pat[i] != pat[state - ns + 1 + i])
                    {
                        break;
                    }
                }
                if (i == ns - 1)
                {
                    return ns;
                }
            }
        }
        return 0;
    }
    static void computeTF(char[] pat, int M, int TF[][])
    {
        int state, x;
        for (state = 0; state <= M; ++state)
        {
            for (x = 0; x < NO_OF_CHARS; ++x)
            {
                TF[state][x] = getNextState(pat, M, state, x);
            }
        }
    }
    static void search(char[] pat, char[] txt)
    {
        int M = pat.length;
        int N = txt.length;
        int[][] TF = new int[M + 1][NO_OF_CHARS];
        computeTF(pat, M, TF);
        int i, state = 0;
        for (i = 0; i < N; i++)
        {
            state = TF[state][txt[i]];
            if (state == M)
            {
                System.out.println("Patrón encontrado " + "en indice " + (i - M + 1));
            }
        }
    }
public
    static void main(String[] args)
    {
        char[] txt = "AABAACAADAABAAABAA".toCharArray();
        char[] pat = "AABA".toCharArray();
        search(pat, txt);
    }
}