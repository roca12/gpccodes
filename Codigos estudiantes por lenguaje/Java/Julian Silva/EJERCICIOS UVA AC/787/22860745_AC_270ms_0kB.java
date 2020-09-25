import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		BigInteger a, b, x, y;
		b = new BigInteger("-999999");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			a = sc.nextBigInteger();
			if(a.compareTo(b)!=0)list.add(a);
			else{
				y = list.get(0);
				for(int i = 0; i < list.size(); i++){
					x = BigInteger.ONE;
					for(int j = i; j < list.size(); j++){
						x = x.multiply(list.get(j));
						y = y.max(x);
					}
				}
			System.out.println(y);
			list.clear();
			}
		}
	}

}