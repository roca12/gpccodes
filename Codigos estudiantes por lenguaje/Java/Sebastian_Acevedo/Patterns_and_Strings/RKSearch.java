import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{	
	
	final static int d=256;
	
	static void RKSearch(String pat, String txt, int q) {
		int M=pat.length();
		int N=txt.length();
		int i,j;
		int p=0;
		int t=0;
		int h=1;
		for (i = 0; i < M-1; i++) {
			h=(h*d)%q;
		}
		for (i = 0; i < M; i++) {
			p=(d*p+pat.charAt(i)%q);
			t=(d*t+txt.charAt(i)%q);
		}
		for (i = 0; i <= N-M; i++) {
			if(p==t) {
				for (j = 0; j < M; j++) {
					if(txt.charAt(i+j)!=pat.charAt(j)) {
						break;
					}
				}
				if(j==M) {
					System.out.println("Patron encontrado en el índice "+i+"-"+(i+M-1));
					
				}
			}
			if(i<N-M) {
				t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+M)%q);
				if(t<0) {
					t=t+q;
				}
			}
		}
		
	}

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String txt = "Hola, perro. Creo que no me funciono";
    	String pat = "funciono";
    	RKSearch(pat, txt, 101);
    	
    	
    	
    	String espera = br.readLine();
    }
}	
