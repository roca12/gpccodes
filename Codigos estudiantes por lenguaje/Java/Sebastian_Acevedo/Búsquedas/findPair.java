import java.util.Scanner;

public class Main{
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,8,30,40,100};
        int n=60;
        if(finPair(arr,n))System.out.println("Sí");
        else System.out.println("No");
    }
    
    static boolean finPair(int arr[], int n){
        int size = arr.length;
        int i=0, j=1;
        while(i<size && j<size){
            if(i != j&&arr[j]-arr[i]==n){
                System.out.println("Par encontrado: "+ arr[i]+"-"+arr[j]);
                return true;
            }else if(arr[j]-arr[i]<n){
                j++;
            }else{
                i++;
            }
        }
        System.out.println("Par no encontrado");
        return false;
    }
}

