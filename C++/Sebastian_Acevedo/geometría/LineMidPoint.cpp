#include <iostream>
#include <String>
//linemidepoint
using namespace std;
string midpoint(int x1, int y1, int x2, int y2) {
	int x, y;
	x=(x1+x2)/2;
	y=(y1+y2)/2;
	string res = (x + ","+ y);
	return res;
	}
int main(int argc, char** argv) {
	int x1,x2,y1,y2;
	//primer punto
	cin>>x1;
	cin>>y1;
	//segundo punto
	cin>>x2;
	cin>>y2;
	string medio = midpoint(x1,y1,x2,y2);
	cout<<medio<<endl;
}
