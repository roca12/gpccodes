// Primer intento

import java.util.*;
public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner ( System.in);
		 int P = s.nextInt();
		 
		 long N = 0, M = 0, K = 0;
		 int t = 0;
		 
		 while ( P-- > 0 )
		{
		    N = s.nextLong();
		    K = s.nextLong();
		    M = s.nextLong();
		    t = 0;
		    while (N<=M ){
		        N=N*K;
		        if(N<=M){
		            t++;
		        }
		    }
		    System.out.println(t);
		}
	}
}


// segúndo este es de c++ 
#include <iostream>
#include <stdio.h>
#define ll long long // Clave del ejersicio fue long long
using namespace std;
int main() 
{
    
    ll X;
    cin>>X;
    while(X--){
        long double N, K, M, t=0;
        cin>>N>>K>>M;
        while(N<=M){
            N=N*K;
            while(N<=M) {
                t++;
                N=N*K;
            }
        }
        cout<<t<<"\n";
    }
    return 0;
}
