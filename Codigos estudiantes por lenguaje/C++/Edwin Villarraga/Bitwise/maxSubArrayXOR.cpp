#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int maxSubArrayXOR(int arr[],int n){
    int ans=INT_MIN;
    for(int i=0;i<n;i++){
        int curr_xor=0;
        for(int j=i;j<n;j++){
            curr_xor = curr_xor ^ arr[j];
            ans = std::max(ans, curr_xor);
        }
    }
    return ans;
}
int main(){
    int arr[] = {8, 1, 2, 12};
    int n = sizeof (arr)/sizeof (arr[0]);
    cout<<"Maximo subarray XOR es "<<maxSubArrayXOR(arr,n)<<endl;
}

