import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 0;
		int maa = 0, mab = 0;
		for(int i = 0; i<n; i++){
		    a+=sc.nextInt();
		    b+=sc.nextInt();
		    if(a>b && (a-b)>maa){
		        maa = a-b;
		    }
		    else if(a<b && (b-a)>mab){
		        mab = b-a;
		    }
		}
		if(maa>mab){
		    System.out.println("1 "+(maa));
		}
		else{
		    System.out.println("2 "+(mab));
		}
	}
}
