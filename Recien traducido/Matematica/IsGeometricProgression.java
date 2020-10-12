// Java program to check if a given array 
// can form geometric progression 
import java.util.Arrays; 
  
public class IsGeometricProgression { 
  
    // function to check series is 
    // geometric progression or not 
    static boolean is_geometric(int arr[], int n) 
    { 
        if (n == 1) 
            return true; 
  
        // Calculate ratio 
        int ratio = arr[1] / (arr[0]); 
  
        // Check the ratio of the remaining 
        for (int i = 1; i < n; i++) { 
            if ((arr[i] / (arr[i - 1])) != ratio) { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 6, 18, 54 }; 
        int n = arr.length; 
  
        if (is_geometric(arr, n)) 
            System.out.println("True"); 
        else
            System.out.println("False"); 
    } 
} 