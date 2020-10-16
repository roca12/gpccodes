package javaapplication1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication1 {

    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int var = sc.nextInt();
        vectorFijo(var);
        vectorDinamico(var);
    }

    public static void vectorFijo(int cantv) {
        int[] v = new int[cantv];
        for (int i = 0; i < cantv; i++) {
            v[i] = r.nextInt();
        }
        for (int i = 0; i < cantv; i++) {
            System.out.println("valores " + v[i]);
        }
    }

    public static void vectorDinamico(int cantv) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < cantv; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < cantv; i++) {
            System.out.println(arr.get(i));
        }
    }
}
