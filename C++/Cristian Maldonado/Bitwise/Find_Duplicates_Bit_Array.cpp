//Funcionamiento dado para positivo y negativo
#include <iostream>
#include <vector>

using namespace std;

struct BitArray{
    vector <int> arr;
    BitArray(int n){
        arr.resize((n >> 5) + 1);
    }

    bool get(int pos){
        int index = (pos >> 5);
        int bitNo = (pos & 0x1F);
        return (arr[index] & (1 << bitNo))!= 0;
    }

    void setPos(int pos){
        int index = (pos >> 5);
        int bitNo = (pos & 0x1F);
        arr[index] |= (1 << bitNo);
    }

    void checkDuplicates(vector <int>& arr, BitArray ba){
        for(int i = 0; i < arr.size(); i++){
            int num = arr[i] - 1;
            if(ba.get(num)){
                cout<<(num+1)<<" ";
            }else{
                ba.setPos(num);
            }
        }
    }
};


int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    vector <int> arr{10, -10, -10, 8, 8, 5, 3, 4, 4, 3, 7, 9, -9, -8, -9};
    BitArray ba(32000);
    ba.checkDuplicates(arr, ba);
    return 0;
}
