import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int c;
        for (int i = 0; i < a; i++) {
            int b=sc.nextInt();
            int y=sc.nextInt(); 
            c=((b/3)*(y/3));
            System.out.println(c);
        }
        
    }
    
}
