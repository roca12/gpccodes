import java.util.Scanner;
import java.util.Arrays;

public class Main{	
	
	static final int MAX=256;
	
	static boolean compare(char[]arr1, char[]arr2) {
		for (int i = 0; i < MAX; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	static void search(String pat, String txt) {
		int M = pat.length();
		int N= txt.length();
		char[] countP = new char[MAX];
		char[] countTW= new char[MAX];
		for (int i = 0; i < M; i++) {
			(countP[pat.charAt(i)])++;
			(countTW[txt.charAt(i)])++;
		}
		for (int i = M; i < N; i++) {
			if(compare(countP, countTW)) {
				System.out.println("Patron anagrama encontrado en el índice "+(i-M)+"-"+(i-1));
			}
			(countTW[txt.charAt(i)])++;
			countTW[txt.charAt(i-M)]--;
			
		}
		if (compare(countP, countTW)) {
			System.out.println("Patron anagrama encontrado en el índice "+(N-M)+"-"+(N-1));
		}
	}

    public static void main(String[] args){
    	String txt = "BACDGABCDA";
    	String pat = "ABCD";
    	search(pat, txt);
    }
}	
