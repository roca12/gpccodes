//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt(), g = 0, p = 0;
            int arr[] = new int[b];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    g++;
                    continue;
                }
                if (arr[j]<arr[j+1]) {
                    p++;
                    continue;
                }
            }
            System.out.println("Case "+(i+1)+": "+p+" "+g);
        }
    }

}
