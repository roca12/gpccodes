import java.util.Scanner;
public class Main{
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int number = sc.nextInt();
    	while(number!=0) {
    		int suma=0;
    		for (int i = 1; i < number+1; i++) {
    			int temp = i*i;
				suma = suma + temp;
			}
    		System.out.println(suma);
    		number = sc.nextInt();
    	}
    }
}
