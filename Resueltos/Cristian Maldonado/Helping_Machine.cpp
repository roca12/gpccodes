#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

typedef long long ll;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    ll casos; cin>>casos;
    for(ll i = 0; i < casos; i++){
        ll tamArr; cin>>tamArr;
        vector <int> arr(tamArr);
        for(ll i = 0; i < tamArr; i++){
            cin >> arr[i];
        }
        ll type1 = count(arr.begin(), arr.end(), 1) + count(arr.begin(), arr.end(), 2);
        ll type2 = count(arr.begin(), arr.end(), 3) + count(arr.begin(), arr.end(), 4);
        ll type3 = count(arr.begin(), arr.end(), 5) + count(arr.begin(), arr.end(), 6);
        cout<<"TYPE 1 - "<<type1<<endl;
        cout<<"TYPE 2 - "<<type2<<endl;
        cout<<"TYPE 3 - "<<type3<<endl;
    }
    return 0;
}
