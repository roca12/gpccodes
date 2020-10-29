import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int rep = sc.nextInt();
		 for (int i = 0; i < rep; i++) {
			int numberslen = sc.nextInt();
			int odd=0;
			for (int j = 0; j < numberslen; j++) {
				if((sc.nextInt())%2==0)odd=1;
			}
			if(odd==0)System.out.println("YES");
			else System.out.println("NO");					
		}
	}    
}
