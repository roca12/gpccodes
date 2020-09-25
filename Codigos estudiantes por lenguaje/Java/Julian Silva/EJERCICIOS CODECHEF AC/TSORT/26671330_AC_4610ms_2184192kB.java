import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int vec[] = new int[x];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = sc.nextInt();
        }
        Arrays.sort(vec);
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
}