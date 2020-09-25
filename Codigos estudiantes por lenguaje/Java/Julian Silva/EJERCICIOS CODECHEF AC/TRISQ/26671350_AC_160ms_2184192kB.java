import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(),aux=0;
        
        for (int i = 0; i < c; i++) {
			int a=sc.nextInt();
			if(a<4) {
				System.out.println("0");
			}else {
				int x=a/2;
				while(x-->=1) {
					aux=aux+x;		
				}
				System.out.println(aux);
				aux=0;
			}
		}
    }
}