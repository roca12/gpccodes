// Java implementation of the approach  

public class NewtonSquareRoot {

    // Function to return the square root of  
    // a number using Newtons method  
    static double squareRoot(double n, double l) {
        // Assuming the sqrt of n as n only  
        double x = n;

        // The closed guess will be stored in the root  
        double root;

        // To count the number of iterations  
        int count = 0;

        while (true) {
            count++;

            // Calculate more closed x  
            root = 0.5 * (x + (n / x));

            // Check for closeness  
            if (Math.abs(root - x) < l) {
                break;
            }

            // Update root  
            x = root;
        }

        return root;
    }

    public static void main(String[] args) {
        double n = 327;
        double l = 0.00001;

        System.out.println(squareRoot(n, l));
    }
}
