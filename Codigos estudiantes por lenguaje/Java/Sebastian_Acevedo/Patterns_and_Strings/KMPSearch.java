import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{	
	
	static void computeLPSarray(String pat, int M, int lps[]) {
		int len=0;
		int i=1;
		lps[0]=0;
		while(i<M){
			if(pat.charAt(i)==pat.charAt(len)) {
				len++;
				lps[i]= len;
				i++;
			}else {
				if(len !=0) {
					len = lps[len-1];
				}else {
					lps[i] = len;
					i++;
				}
			}
		}
		
	}
	
	static void KMPSearch(String pat, String txt) {
		int M = pat.length();
		int N=txt.length();
		int lps[]= new int[M];
		int j=0;
		computeLPSarray(pat, M, lps);
		int i=0;
		while(i<N) {
			if(pat.charAt(j)==txt.charAt(i)) {
				i++;
				j++;
			}
			if(j==M) {
				System.out.println("Patrón encontrado en el índice "+(i-j)+"-"+(i-1));
				j=lps[j-1];
			}else if (i<N&&pat.charAt(j) != txt.charAt(i)) {
				if(j!=0) {
					j=lps[j-1];
				}else {
					i=i+1;
				}
			}
		}
		
	}

    public static void main(String[] args) throws IOException{
    //	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String txt = "ABCABCABCABCA";
    	String pat = "ABC";
    	KMPSearch(pat, txt);
    }
}	
