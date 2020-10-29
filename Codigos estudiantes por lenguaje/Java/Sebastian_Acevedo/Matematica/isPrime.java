package programming;

public class Main{
	
	static boolean isPrime(int x) {
		if(x<2)return false;
		if(x==2)return true;
		for (int i = 2; i*i <= x; i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	
    public static void main(String[] args) {
    	int n= 101;
    	if(isPrime(n))System.out.println("Es primo");
    	else System.out.println("No es primo");
    }  
}
