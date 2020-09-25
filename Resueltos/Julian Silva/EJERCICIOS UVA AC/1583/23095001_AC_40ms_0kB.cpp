#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int main (int argc, char *argv[]) {
	int n,m,b[101],v,i,j,l,sum;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		scanf("%d",&m);
		l=0;
		for(j=m-46;j<=m;j++)
		{
			v=j;sum=0;
			while(v!=0)
			{
				sum=sum+v%10;
				v=v/10;
			}
			if((sum+j==m))
				  
				  
			{
				b[l++]=j;
			}
		}
		sort(b,b+l);
		if(l==0)
			printf("0\n");
		else printf("%d\n",b[0]);
	}
	return 0;
}

