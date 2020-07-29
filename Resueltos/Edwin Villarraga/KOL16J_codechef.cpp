#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main(){
    int  c;
    cin>>c;
    while(c--){
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        int cnt =0,c=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                cnt++;
                break;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1]!=arr[i]+1){
                c=1;
                break;
            }
        }
        if(c==1 && cnt==n){
            cout <<"yes"<<endl;
            cnt=0;
        }
        else{
            cout <<"no"<<endl;
            cnt=0;
        }
        cnt=0;

    }
    return 0;
}
