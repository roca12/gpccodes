import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int rep = sc.nextInt();
    for (int i = 0; i < rep; i++) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res= num2 - num1;
		if(res > 0) {
			if(res%2 !=0)System.out.println(1);
			else System.out.println(2);
		}else if (res < 0) {
			if(res%2 == 0)System.out.println(1);
			else System.out.println(2);
		}else {
			System.out.println(0);
		}
	}
  }
}
