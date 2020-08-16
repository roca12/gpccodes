
import java.util.ArrayList;
import java.util.Scanner;

public class Gray_Codes_Of_N {

    static void generateGrayArr(int n) {
        if (n <= 0) {
            return;
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add("0");
        arr.add("1");
        int i, j;
        for (i = 2; i < (1 << n); i = i << 1) {
            for (j = i - 1; j >= 0; j--) {
                arr.add(arr.get(j));
            }
            for (j = 0; j < i; j++) {
                arr.set(j, "0" + arr.get(j));
            }
            for (j = i; j < 2 * i; j++) {
                arr.set(j, "1" + arr.get(j));
            }
        }
        for (i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        generateGrayArr(numero);
    }
}
