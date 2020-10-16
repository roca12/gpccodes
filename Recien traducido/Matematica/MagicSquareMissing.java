// Java program to fill blanks with numbers 
  
public class MagicSquareMissing { 
     
// Function to print the original matrix 
static int printFilledDiagonal(int sq[][]) 
{ 
    // Calculate the sum of all the elements 
    // of the matrix 
    int sum = 0; 
    for (int i = 0; i < 3; i++) 
        for (int j = 0; j < 3; j++) 
            sum += sq[i][j]; 
  
    // Required sum of each row (from the approach) 
    sum /= 2; 
  
    for (int i = 0; i < 3; i++) { 
  
        // Row sum excluding the diagonal element 
        int rowSum = 0; 
        for (int j = 0; j < 3; j++) 
            rowSum += sq[i][j]; 
  
        // Element that must be inserted at 
        // diagonal element of the current row 
        sq[i][i] = sum - rowSum; 
    } 
  
    // Print the updated matrix 
    for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 3; j++) 
            System.out.print( sq[i][j] + " "); 
        System.out.println(); 
    } 
    return 0; 
} 
  
// Driver Program to test above function 
  
    public static void main (String[] args) { 
        int sq[][] = { 
        { 0, 7, 6 }, 
        { 9, 0, 1 }, 
        { 4, 3, 0 } 
    }; 
  
    printFilledDiagonal(sq); 
    } 
      
} 
// This code is contributed by anuj_67.. 