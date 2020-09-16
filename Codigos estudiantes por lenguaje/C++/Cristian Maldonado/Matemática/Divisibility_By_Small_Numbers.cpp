#include <iostream>
#include <string.h>
#include <sstream>

using namespace std;

bool isMultipleOf[12];

void divisibility (int num){
    memset(isMultipleOf, false, 12);
    stringstream check;
    check << num;
    string M;
    check >> M;
    int n = M.size();
    int sum = 0;
    for(int i = 0; i < n; i++){
        sum += (M[i] - '0');
    }
    int lastDigit = M[n - 1] - '0';
    isMultipleOf[1] = true;
    isMultipleOf[2] = lastDigit % 2 == 0;
    isMultipleOf[3] = sum % 3 == 0;
    if(n > 1){
        isMultipleOf[4] = stoi(M.substr(n - 2, n)) % 4 == 0;
    }else{
        isMultipleOf[4] = lastDigit % 4 == 0;
    }
    isMultipleOf[5] = lastDigit == 0 || lastDigit == 5;
    isMultipleOf[6] = isMultipleOf[2] && isMultipleOf[3];
    int altsum = 0;
    int pattern[] = {1, 3, 2, -1, -3, -2};
    int j = 0;
    for(int i = n - 1; i >= 0; i--){
        altsum += pattern[j] * (M[i] - '0');
        j = (j + 1) % 6;
    }
    isMultipleOf[7] = abs(altsum) % 7 == 0;
    if(n > 2){
        isMultipleOf[8] = stoi(M.substr(n - 3, n)) % 8 == 0;
    }else{
        isMultipleOf[8] = stoi(M) % 8 == 0;
    }
    isMultipleOf[9] = sum % 8 == 0;
    isMultipleOf[10] = lastDigit == 0;
    altsum = 0;
    int s = 1;
    for(int i = n - 1; i >= 0; i--){
        altsum += s * (M[i] - '0');
        s = -s;
    }
    isMultipleOf[11] = abs(altsum) % 11 == 0;
    isMultipleOf[12] = isMultipleOf[2] && isMultipleOf[4];
}

int main()
{
    divisibility(100);
    for(int i = 1; i < 13; i++){
        cout << i << ": "<<isMultipleOf[i] << endl;
    }
    return 0;
}
