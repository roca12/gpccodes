#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int vec[7];
struct notas{
	double total;
	void calcular(){
		if(total>=90){
			cout<<"A"<<"\n";
		}else if(total>=80 && total < 90){
			cout<<"B"<<"\n";
		}else if(total>=70 && total < 80){
			cout<<"C"<<"\n";
		}else if(total>=60 && total < 70){
			cout<<"D"<<"\n";
		}else{
			cout<<"F"<<"\n";
		}
	}
};
int main(int argc, char const *argv[]) {
	int n,cont=1;
	cin>>n;
	while(n>0){
	double total1=0;
	memset(vec,0,sizeof(vec));
		for(int i=0;i<7;++i){
			cin>>vec[i];
			if(i<4){
				total1+=vec[i];
			}
		}
	int vec2[]={vec[4],vec[5],vec[6]};
	int len=sizeof(vec2)/sizeof(vec2[0]);
	vector <int> myvec(vec2,vec2+len);
	sort(myvec.begin(),myvec.end());
	double t2=(myvec[1]+myvec[2])/2;
	total1+=t2;
	notas t={total1};
	cout<<"Case "<<cont<<": ";
	t.calcular();
	cont++;
	myvec.clear();
	n--;
	}
}
