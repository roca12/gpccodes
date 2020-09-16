
public class Main {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(minPerimeter(n));

	}
	static long minPerimeter(int n){
		int res=(int)Math.sqrt(n);
		int sq = res * res;
		if(sq==n) {
			return res*4;
		}else {
			long row = n/res;
			long perimeter = 2*(res+row);
			if(n%res!=0){
				perimeter += 2;
			}
			return perimeter;
		}
	}

}
