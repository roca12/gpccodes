#include <bits/stdc++.h>
void minimumSwaps(int a[],int n){
    int maxx = -1,minn = a[0], left = 0, r = 0;
    for(int i = 0; i < n ; i++){
        if(a[i] > maxx){
            maxx = a[i];
            left = i;
        }
        if(a[i] <= minn){
            minn = a[i];
            r = i;
        }
    }
    if(r < left){
        printf("%ld",(long long)(left+(n-r-2)));
    }
    else{
        printf("%ld",(long long)(left+(n-r-1)));
    }
}
int main(){
    int a[]={5 ,6 ,1 ,3};
    int n=sizeof(a)/sizeof(a[0]);
    minimumSwaps(a,n);
}
