public class Main {
    static int gcd(int a, int b){
        return a==0?b:gcd(b%a, a);
    }
    static int fingGCD(int arr[], int n){
        int res=arr[0];
        for (int i = 1; i <n; i++) {
            res=gcd(arr[i],res);
        }
        return res;
    }

    public static void main(String[] args) {
     int arr[]={2,4,6,8,16};
     int n=arr.length;
        System.out.println(fingGCD(arr, n));
    }
    
}
