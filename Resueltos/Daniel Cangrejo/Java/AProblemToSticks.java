import java.util.Scanner;
import java.util.HashSet;

public class Main {
    
     public static void main(String[] args) {
         HashSet<Long> set = new HashSet<>();
         Scanner sc= new Scanner(System.in);
         long rep =  sc.nextLong();
         for (int i = 0; i < rep; i++) {
             long tamano = sc.nextLong();
            for (int j = 0; j < tamano; j++) {
                long num = sc.nextInt();
                if(num!=0)set.add(num);
            }
            System.out.println(set.size());
            set.clear();
        }         
     }
}
