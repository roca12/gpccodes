

#include <algorithm> 
#include <iostream> 
using namespace std;

int main() {
    int arr[] = {1, 2, 3};
    int n=sizeof(arr)/sizeof(arr[0]);

    sort(arr, arr + n);

    cout << "The "<<n<<"! possible permutations with "<<n<<" elements:\n";
    do {
        cout << arr[0] << " " << arr[1] << " " << arr[2] << "\n";
    } while (next_permutation(arr, arr + 3));

    cout << "After loop: " << arr[0] << ' '
            << arr[1] << ' ' << arr[2] << '\n';

    return 0;
}
