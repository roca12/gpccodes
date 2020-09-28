import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            if (set.add(Long.parseLong(br.readLine()))) {
                
            }else {
                System.out.println("Ya existe en el Set");
            }
        }
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
