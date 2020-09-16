import java.util.LinkedList;
public class Main {
	static void primeFactos(long n){
	    for(long p = 2;p * p <=n ;p++){
	        while(n%p==0){
	            System.out.print(p+" ");
	            n/=p;
	        }
	    }
	    if(n>1){
	        System.out.println(n);
	    }
	}

    public static void main(String[] args) {
        long a=25;
       primeFactos(a);
    }
}
