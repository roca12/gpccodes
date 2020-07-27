//Tener en cuenta que el algortimo puede ser
//demasiado lento con una cantidad de consultas considerables
#include <iostream>

using namespace std;

bool isPrime(int x){
    if(x < 2){
        return false;
    }
    if(x == 2){
        return true;
    }
    if(x % 2 == 0){
        return false;
    }
    for(int i = 3; i * i <= x; i++){
        if(x % i == 0){
            return false;
        }
    }
    return true;
}

int main()
{
    int n;
    scanf("%d", &n);
    if(isPrime(n)){
        printf("Es primo\n");
    }else{
        printf("No es primo\n");
    }
    return 0;
}
