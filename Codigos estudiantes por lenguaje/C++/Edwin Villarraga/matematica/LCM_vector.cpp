#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
long lcm_array(int arr[],int len){
    long lcm=1;
    int divisor=2;
    while(true){
        int counter=0;
        bool divisible=false;
        for(int i=0;i<len;i++){
            if(arr[i]==0){
                return 0;
            }else if(arr[i]<0){
                arr[i]=arr[i]*(-1);
            }
            if(arr[i]==1){
                counter++;
            }
            if(arr[i]%divisor == 0){
                divisible=true;
                arr[i]=arr[i]/divisor;
            }
        }
        if(divisible){
            lcm=lcm*divisor;
        }else{
        divisor++;
        }if(counter == len){
            return lcm;
        }
    }
}
int main() {
    int arr[]={2,7,3,9,4};
    int len=sizeof arr/sizeof arr[0];
    cout<<lcm_array(arr,len);
}
