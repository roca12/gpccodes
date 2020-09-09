
public class Main {
 //linedividedInratios
	public static void main(String[] args) {
	    double x1 = 2; 
	    double y1 = 0; 
	    double x2 = 5;
	    double y2 = 5;
	    double m = 3;
	    double n = 2;
	    section(x1, y1, x2, y2, m, n);
	}
	
	static void  section(double x1,double y1,double x2,double y2,double m,double n){
		double x = ((n*x1)+(m*x2))/(m+n);
		double y = ((n*y1)+(m*y2))/(m+n);
		System.out.println("(" + x + "," + y + ")");
	
	}

}
