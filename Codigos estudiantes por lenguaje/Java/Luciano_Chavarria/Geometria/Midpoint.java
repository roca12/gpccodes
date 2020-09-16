import java.util.*;

public class Main {
    static void puntomedio(int x1, int x2, int y1, int y2) {
        System.out.println((x1 + x2) / 2 + " , " + (y1 + y2) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        puntomedio(x1, x2, y1, y2);
    }
}
