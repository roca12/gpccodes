import java.util.Scanner;

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
    	Scanner sc = new Scanner(System.in);    	
    	while(sc.hasNext()) {
    		int n= sc.nextInt();
    		if(n%2==0) {
    			System.out.println((n/2) +" "+ (n/2));
        	}
        	else {
        		n=n-1;
        		int part1=n/2, part2=(n/2)+1;
        		while(isPrime(part1)==true || isPrime(part2)==true) {
        			part1--;
        			part2++;
        		}
        		System.out.println(part1 +" "+ part2);
        	}
    	}
 
