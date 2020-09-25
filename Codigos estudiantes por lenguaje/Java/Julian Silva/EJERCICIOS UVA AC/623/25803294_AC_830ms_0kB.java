import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger x ,y;
		int z;
		while(sc.hasNext()){
			z = sc.nextInt();
			x = new BigInteger("1");
			y = new BigInteger("1");
			int aux = 1;
			while(aux <= z){
				y = y.multiply(x);
				x = x.add(new BigInteger("1"));
				aux++;
			}
			System.out.println(z + "!");
			System.out.println(y);
		}
        }
}