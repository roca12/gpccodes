import java.util.Arrays;
import java.util.Scanner;

public class Automate_the_Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int term1 = sc.nextInt();
			int term2 = sc.nextInt();
			int Final = sc.nextInt();
			int attendance = sc.nextInt();
			int [] tests = new int [3];
			for (int j = 0; j < tests.length; j++) {
				tests [j] = sc.nextInt();
			}
			Arrays.sort(tests);
			int test = (tests[2]+tests[1])/2;
			int resultado = term1+term2+Final+attendance+test;
			if(resultado < 60) {
				System.out.println("Case "+(i+1)+":"+" F");
			}else if(resultado>=60 && resultado<70) {
				System.out.println("Case "+(i+1)+":"+" D");
			}else if(resultado>=70 && resultado <80) {
				System.out.println("Case "+(i+1)+":"+" C");
			}else if(resultado>=80 && resultado <90) {
				System.out.println("Case "+(i+1)+":"+" B");
			}else if(resultado>=90 && resultado <=100) {
				System.out.println("Case "+(i+1)+":"+" A");
			}
		}
	}

}
