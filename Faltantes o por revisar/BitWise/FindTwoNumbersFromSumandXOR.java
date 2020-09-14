// Java program to find two numbers with  
// given Sum and XOR such that value of  
// first number is minimum.  

public class FindTwoNumbersFromSumandXOR {

// Function that takes in the sum and XOR  
// of two numbers and generates the two  
// numbers such that the value of X is  
// minimized  
    static void compute(long S, long X) {
        long A = (S - X) / 2;
        int a = 0, b = 0;
        final int LONG_FIELD_SIZE = 8;

        // Traverse through all bits  
        for (int i = 0; i < 8 * LONG_FIELD_SIZE; i++) {
            long Xi = (X & (1 << i));
            long Ai = (A & (1 << i));
            if (Xi == 0 && Ai == 0) {
                // Let us leave bits as 0.  
            } else if (Xi == 0 && Ai > 0) {
                a = ((1 << i) | a);
                b = ((1 << i) | b);
            } else if (Xi > 0 && Ai == 0) {
                a = ((1 << i) | a);

                // We leave i-th bit of b as 0.  
            } else // (Xi == 1 && Ai == 1)  
            {
                System.out.println("Not Possible");
                return;
            }
        }
        System.out.println("a = " + a + "\nb = " + b);
    }

// Driver function  
    public static void main(String[] args) {
        long S = 17, X = 13;
        compute(S, X);

    }
}
