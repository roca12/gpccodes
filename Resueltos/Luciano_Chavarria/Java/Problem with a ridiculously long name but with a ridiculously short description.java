

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = {76,16,56,96,36};
        int a = Integer.parseInt(br.readLine());
        BigInteger b;
        for (int i = 0; i < a; i++) {
            b = new BigInteger(br.readLine());
            if (b.equals(BigInteger.ZERO)) {
                bw.write(String.valueOf(1));
                bw.flush();
            }else if (b.equals(BigInteger.ONE)){
                bw.write(String.valueOf(66));
                bw.flush();
            }else{
                String k = String.valueOf(b.mod(new BigInteger("5")));
                bw.write(String.valueOf(arr[Integer.parseInt(k)]));
                bw.flush();
            }
            System.out.println("");
        }
    }

}
