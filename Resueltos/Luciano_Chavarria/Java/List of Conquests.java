import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            String b = sc.next();
            arr.add(b);
            sc.nextLine();
        }
        Collections.sort(arr);
        HashSet<String> hs = new HashSet<>(arr);
        ArrayList<String> aux = new ArrayList<>(hs);
        Collections.sort(aux);
        for (String s: aux) {
            System.out.println(s+" "+Collections.frequency(arr, s));
        }
    }
}
