package ready;

// Java program to evaluate area  
// of a polygon using shoelace formula 

public class ShoelacePoly {

    // (X[i], Y[i]) are coordinates of i'th point. 
    public static double polygonArea(double X[], double Y[],
            int n) {
        // Initialze area 
        double area = 0.0;

        // Calculate value of shoelace formula 
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            area += (X[j] + X[i]) * (Y[j] - Y[i]);

            // j is previous vertex to i 
            j = i;
        }

        // Return absolute value 
        return Math.abs(area / 2.0);
    }

    // Driver program  
    public static void main(String[] args) {
        double X[] = {0, 2, 4};
        double Y[] = {1, 3, 7};

        int n = 3;
        System.out.println(polygonArea(X, Y, n));
    }

}
