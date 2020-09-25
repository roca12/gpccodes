import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        StringBuilder strl = new StringBuilder("");
        while ((strl = new StringBuilder(br.readLine())) != null) {
            if (strl.charAt(0) == '.') {
                break;
            }
            int x = 1;
            for (int i = 2; i <strl.length()+1; i++) {
                if (strl.length() % i == 0) {
                    int lrg = strl.length() / i;
                    boolean cont = true;
                    for (int j = lrg; j < strl.length(); j++) {
                        if (strl.charAt(j) != strl.charAt(j % lrg)) {
                            cont = false;                           
                            break;                           
                        }
                    }
                   
                    if (cont) {                       
                        x = Math.max(x, i);                       
                    }
                }
            }
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
}
