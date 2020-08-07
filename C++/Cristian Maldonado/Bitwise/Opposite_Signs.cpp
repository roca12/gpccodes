#include <iostream>

using namespace std;

bool opposite(int a, int b){
    return (a ^ b) < 0;
}

int main()
{
    int a = 123;
    int b = -123;
    if(opposite(a, b)){
        cout<<"Distintos signos"<<endl;
    }else{
        cout<<"Iguales signos"<<endl;
    }
    return 0;
}
