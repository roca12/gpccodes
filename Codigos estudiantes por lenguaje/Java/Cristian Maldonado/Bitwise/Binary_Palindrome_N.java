public class Binary_Palindrome_N {

    static int INT_MAX = Integer.MAX_VALUE;
    
    static int isKThBitSet(int x, int k){
        return ((x &(1 << (k - 1))) > 0) ? 1: 0;
    }

    static int leftMostSetBit(int x){
        int count = 0;
        while(x > 0){
            count++;
            x = x >> 1;
        }
        return count;
    }
    
    static int isPalindrome(int x){
        int l = leftMostSetBit(x);
        int r = 1;
        
        while(l > r){
            if(isKThBitSet(x, l) != isKThBitSet(x, r)){
                return 0;
            }
            l--;
            r++;
        }
        return 1;
    }
    
    static int findNThPalindrome(int n){
        int pal_count = 0;
        int i = 0;
        for (i = 1; i <= INT_MAX; i++) {
            if(isPalindrome(i)>0){
                pal_count++;
            }
            if(pal_count == n){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int n = 14;
       int res = findNThPalindrome(n);
        System.out.println(res + " "+ Integer.toString(res, 2));
    }
    
}
