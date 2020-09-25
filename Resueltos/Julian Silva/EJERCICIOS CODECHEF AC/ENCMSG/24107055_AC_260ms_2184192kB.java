import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int p = 0; p < c; p++) {
            int a;
            int b = sc.nextInt();
            String str = sc.next();
            char tam[] = str.toCharArray();
            int x;
            for (a = 0; a < tam.length - 1; a++) {
                x = a + 1;
                char cam = tam[a];
                tam[a] = tam[x];
                tam[x] = cam;
                a++;
            }
            String ver = "zyxwvutsrqponmlkjihgfedcba";
            char n[] = ver.toCharArray();
            for (a = 0; a < tam.length; a++) {
                tam[a] = n[tam[a] - 'a'];
            }
            for (a = 0; a < tam.length; a++) {
                System.out.print(tam[a]);
            }
            System.out.println();
        }

    }
}
