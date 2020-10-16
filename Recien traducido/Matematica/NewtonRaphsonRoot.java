// Java program for implementation of  
// Newton Raphson Method for solving  
// equations 
public class NewtonRaphsonRoot { 
      
    static final double EPSILON = 0.001; 
      
    // An example function whose solution 
    // is determined using Bisection Method. 
    // The function is x^3 - x^2 + 2 
    static double func(double x) 
    { 
        return x * x * x - x * x + 2; 
    } 
      
    // Derivative of the above function  
    // which is 3*x^x - 2*x 
    static double derivFunc(double x) 
    { 
        return 3 * x * x - 2 * x; 
    } 
      
    // Function to find the root 
    static void newtonRaphson(double x) 
    { 
        double h = func(x) / derivFunc(x); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = func(x) / derivFunc(x); 
      
            // x(i+1) = x(i) - f(x) / f'(x)  
            x = x - h; 
        } 
      
        System.out.print("The value of the"
                + " root is : " 
                + Math.round(x * 100.0) / 100.0); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
          
        // Initial values assumed 
        double x0 = -20;  
        newtonRaphson(x0); 
    } 
} 