package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication1 {

    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tf = sc.nextInt();
        int tc = sc.nextInt();
        int[][] arr = new int[tf][tc];
        for (int i = 0; i < tf; i++) {
            for (int j = 0; j < tc; j++) {
                arr[i][j] = r.nextInt();
            }
        }
        for (int i = 0; i < tf; i++) {
            for (int j = 0; j < tc; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

}
