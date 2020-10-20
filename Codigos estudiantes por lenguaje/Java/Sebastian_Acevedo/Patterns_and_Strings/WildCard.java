import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static boolean strMatch(String str, String pat, int n, int m) {
		if(m==0) return  n==0;
		
		boolean [][] lookup = new boolean[n+1][m+1];
		
		for (int i = 0; i < n+1; i++) {
			Arrays.fill(lookup[i], false);
		}
		lookup[0][0]=true;
		for (int j = 1; j <= m; j++) {
			if(pat.charAt(j-1)=='*') {
				lookup[0][j]=lookup[0][j-1];
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(pat.charAt(j-1)=='*') {
					lookup[i][j]=lookup[i][j-1]||lookup[i-1][j];
				}else if(pat.charAt(j-1)=='?'||str.charAt(i-1)==pat.charAt(j-1)){
					lookup[i][j]=lookup[i-1][j-1];
				}else {
					lookup[i][j]=false;
				}
			}
		}
		return lookup[n][m];		
	}
	
	public static void main(String[] args){
		String str = "anitalavalatina";
		String pat = "?nitalava?";
		if(strMatch(str, pat, str.length(), pat.length())) {
			System.out.println("Iguales");
		}else {
			System.out.println("Diferentes");
		}	 
	}    
}
