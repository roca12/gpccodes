// Java code for solving inverse interpolation 

public class InvLagrangeInterpolation {

// Consider a structure 
// to keep each pair of 
// x and y together 
    static class Data {

        double x, y;

        public Data(double x, double y) {
            super();
            this.x = x;
            this.y = y;
        }

    };

// Function to calculate 
// the inverse interpolation 
    static double inv_interpolate(Data[] d, int n, double y) {
        // Initialize final x 
        double x = 0;

        int i, j;

        for (i = 0; i < n; i++) {

            // Calculate each term 
            // of the given formula 
            double xi = d[i].x;
            for (j = 0; j < n; j++) {

                if (j != i) {
                    xi = xi
                            * (y - d[j].y)
                            / (d[i].y - d[j].y);
                }
            }

            // Add term to final result 
            x += xi;
        }
        return x;
    }

// Driver Code 
    public static void main(String[] args) {

        // Sample dataset of 4 points 
        // Here we find the value 
        // of x when y = 4.5 
        Data[] d = {new Data(1.27, 2.3),
            new Data(2.25, 2.95),
            new Data(2.5, 3.5),
            new Data(3.6, 5.1)};

        // Size of dataset 
        int n = 4;

        // Sample y value 
        double y = 4.5;

        // Using the Inverse Interpolation 
        // function to find the 
        // value of x when y = 4.5 
        System.out.printf("Value of x at y = 4.5 : %.5f",
                inv_interpolate(d, n, y));
    }
}
