import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer("");
        int i=1;
        while (true) {
            String[] str=sc.readLine().split(" ");
            long a = Integer.parseInt(str[0]);
            long b =Integer.parseInt(str[1]);
            if(a==0 &&b==0){
                break;
            }
            s.append("Case ").append(i).append(": ");
            s.append(a*b*(b-1)*(a-1)/4).append("\n");
            i++;
        }
        System.out.print(s);
    }
}