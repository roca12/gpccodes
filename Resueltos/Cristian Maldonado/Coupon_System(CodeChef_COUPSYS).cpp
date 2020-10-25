#include <iostream>
#include <tuple>
#define MAX 5000

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);cin.tie(NULL);
    int casos; cin>>casos;
    while(casos--){
        tuple<int, int, int> max_1 (MAX, 1, 0);
        tuple<int, int, int> max_2 (MAX, 2, 0);
        tuple<int, int, int> max_3 (MAX, 3, 0);
        int tam; cin>>tam;
        for(int i = 0; i < tam; i++){
            int a, b, c; cin>>a>>b>>c;
            switch(b){
            case 1:
                if(c > get<2>(max_1)){
                    max_1 = make_tuple(a, 1, c);
                    continue;
                }else if(c == get <2> (max_1) && a < get<0>(max_1)){
                    max_1 = make_tuple(a, 1, c);
                    continue;
                }
                continue;
            case 2:
                if(c > get<2>(max_2)){
                    max_2 = make_tuple(a, 2, c);
                    continue;
                }else if(c == get <2> (max_2) && a < get<0>(max_2)){
                    max_2 = make_tuple(a, 2, c);
                    continue;
                }
                continue;
            case 3:
                if(c > get<2>(max_3)){
                    max_3 = make_tuple(a, 3, c);
                    continue;
                }else if(c == get <2> (max_3) && a < get<0>(max_3)){
                    max_3 = make_tuple(a, 3, c);
                    continue;
                }
                continue;
            }
        }
        cout<<get<2>(max_1)<<" "<<get<0>(max_1)<<endl;
        cout<<get<2>(max_2)<<" "<<get<0>(max_2)<<endl;
        cout<<get<2>(max_3)<<" "<<get<0>(max_3)<<endl;
    }
    return 0;
}
