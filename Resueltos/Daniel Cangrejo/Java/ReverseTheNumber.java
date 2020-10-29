import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
       for (int i = 0; i < t; i++) {
        int aux = 0;
        long x = sc.nextLong();
        long inter = numIn(x);
        System.out.println(inter);
    }
}

static long numIn(long x) {
    long aux = 0;
    while (x > 0) {
        aux = aux * 10 + x % 10;
        x /= 10;
    }
    return aux;
}
}
