#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

typedef long long int lli;

int main(){
    ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
    lli cases; cin>>cases;
    while(cases--){
        lli n, k, x, y, i, dies = 0;
        cin>>n>>k>>x>>y;
        pair <lli, bool> arr[n];
        for(lli j = 0; j < n; j++){
            arr[j].first = 0;
            arr[j].second = false;
        }
        i = x;
        arr[i].first = -1; arr[i].second = true; 
        while (true){
            if(arr[y].first == -1 && arr[y].second == true){
                cout<<"YES"<<endl;
                break;
            }
            i = ((i + k)%n);
            if(arr[i].first == 0 && arr[i].second == false){
                arr[i].first = -1;
                arr[i].second = true;
            }else{
                dies++;
                if(dies >= 2){
                    cout<<"NO"<<endl;
                    break;
                }
            }
        }
    } 
    return 0;
}
