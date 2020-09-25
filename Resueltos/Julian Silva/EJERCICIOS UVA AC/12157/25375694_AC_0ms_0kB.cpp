#include <cstdlib>
#include <bits/stdc++.h>
int main()
{
	int C, A, num, mC, jC;
	scanf("%d", &C);
	
	for (int t = 1; t <= C; ++t)
	{
		scanf("%d", &A);
		mC = jC = 0;
		while (A--)
		{
			scanf("%d", &num);
			mC += (num / 30) * 10 + 10;
			jC += (num / 60) * 15 + 15;
		}
		printf("Case %d: ", t);
		
		if (mC < jC)
			printf("Mile %d\n", mC);
		else if (mC == jC)
			printf("Mile ");
		
		if (jC <= mC)
			printf("Juice %d\n", jC);
	}
}