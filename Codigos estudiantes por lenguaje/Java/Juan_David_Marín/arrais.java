import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Main {
    static Random r= new Random();
    
    public static void main(String[] args) {
        ArrayList<Long> lista=new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            lista.add(r.nextLong());
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(lista.get(i));
        }
    }
}