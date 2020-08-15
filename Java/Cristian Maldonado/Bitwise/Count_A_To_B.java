public class Count_A_To_B {

    static int countSetBit(int n){
        int count = 0;
        while(n != 0){
            count += n&1;
            n>>=1;
        }
        return count;
    }
    static int flippedCount(int a, int b){
        return countSetBit(a ^ b);
    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int res = flippedCount(a, b);
        System.out.println("("+a+", "+b+") -> "+res+": "+Integer.toString(res, 2));
    }  
}
