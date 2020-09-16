public class Main {
	    static int cassini(int n) {
	        return (n & 1) != 0 ? -1 : 1;
	    }

	    public static void main(String args[]) {
	        int n = 5;
	        System.out.println(cassini(n));
	   }
}
