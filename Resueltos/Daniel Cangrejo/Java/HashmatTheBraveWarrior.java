import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        long v = sc.nextLong();  long t = sc.nextLong();
        long res = (v-t);
        System.out.println(Math.abs(res));
        }

    }

}
