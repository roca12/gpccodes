import java.util.Scanner;
import java.util.Arrays;

public class Main{	
	
	static int NO_OF_CHARS = 256;
	
	static int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	static void badChar(char[] str, int size, int[]badchar) {
	//	Arrays.fill(, val);
		int i;
		for (i = 0; i < NO_OF_CHARS; i++) {
			badchar[i]=-1;
		}
		for (i = 0; i < size; i++) {
			badchar[(int)str[i]]=i;
		}
		
	}
	
	static void search(char[]txt, char []pat) {
		int m=pat.length;
		int n=txt.length;
		int badchar[]= new int[NO_OF_CHARS];
		badChar(pat, m, badchar);
		int s=0;
		while(s<=(n-m)) {
			int j = m-1;
			while(j>=0 && pat[j]==txt[s+j]) {
				j--;
			}
			if(j<0) {
				System.out.println("Patron encontrado en el índice "+s+"-"+(s+m-1));
				s+=(s+m<n)?m-badchar[txt[s+m]]:1;
			}else {
				s+=max(1, j-badchar[txt[s+j]]);
			}
		}
		
	}

    public static void main(String[] args){
    	char txt[]= "anitalavalatina".toCharArray();
    	char pat[]= "tala".toCharArray();
    	search(txt, pat);
    	
    	
    	Scanner sc = new Scanner(System.in);
    	int num= sc.nextInt(); 

    }
}	
