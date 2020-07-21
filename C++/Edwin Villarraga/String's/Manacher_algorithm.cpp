using namespace std;
#include<bits/stdc++.h>
#include<cstdlib>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define string_valueof(x) puts(x);
void findLPS(char text[],int N){
    if(N==0){
        return;
    }
    N=2*N+1;
    int L[N];
    L[0]=0;
    L[1]=1;
    int C=1;
    int R=2;
    int i_mirror;
    int max_LPS_len=0;
    int max_LPS_centerPos=0;
    int start=-1,endLPS=-1,diff=-1;
    for(int i = 2 ;i < N ; i++){
        i_mirror=2*C-i;
        L[i]=0;
        diff= R - i;
        if(diff>0){
            L[i] = std::min(L[i_mirror],diff);
        }
        try{
            while(((i+L[i])<N and (i-L[i])>0) and (((i + L[i] + 1)%2 == 0)|| text[(i + L[i]+1)/2]==text[(i - L[i] -1)/2])){
                L[i]++;
            }
        }catch(exception& e){
        }
        if(L[i]>max_LPS_len){
            max_LPS_len=L[i];
            max_LPS_centerPos=i;
        }
        if(i + L[i] > R){
            C=i;
            R = i + L[i];
        }
    }
    start=(max_LPS_centerPos-max_LPS_len)/2;
    endLPS=start+max_LPS_len-1;
    cout<<"LPS del string es ";
    string_valueof(text);
    cout<<" : ";
    for(int j =start;j<=endLPS ;j++){
        cout<<text[j];
    }
    cout<<endl;
    /*
    cout<<"inicio : "<<start<<"    -    final : "<<endLPS<<endl;
    for(int j=0;j<N;j++){
        cout<<L[j]<<" ";
    }
    */
}
int main() {
    FAST;
    char text[1000];
    gets(text);
    int N=strlen(text);
    findLPS(text,N);
}
