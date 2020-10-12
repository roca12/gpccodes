// Java program to count squares 
// in a rectangle of size m x n 

public class NumberSquaresRectangle {

    // Returns count of all squares  
    // in a rectangle of size m x n 
    static int countSquares(int m,
            int n) {
        // If n is smaller, swap m and n 
        if (n < m) {
            // swap(m, n) 
            int temp = m;
            m = n;
            n = temp;
        }
        // Now n is greater dimension,  
        // apply formula 
        return m * (m + 1) * (2 * m + 1)
                / 6 + (n - m) * m * (m + 1) / 2;
    }

    public static void main(String[] args) {
        int m = 4, n = 3;
        System.out.println("Count of squares is "
                + countSquares(m, n));
    }
}
