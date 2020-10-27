//Divisores de un número
public class Main {
	
	static int divisors(int x) {
		int nDIV = 1; //numero de divisores
		for (int i = 2; i+i <= x ; i++) {
			int cnt = 0;
			while(x%i == 0) {
				cnt++;
				x/=i;
			}
			nDIV*=cnt+1;
		}
		if(x>1){
			nDIV*=2;
		}
		return nDIV;
	}
	
	public static void main(String[] args) {
		int num = 6515;
		System.out.println(num + " es divisible por " + divisors(num) + " números");
	}
}
