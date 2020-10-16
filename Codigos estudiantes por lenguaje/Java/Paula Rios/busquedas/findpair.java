import java.util.*;
public class Main {
    static boolean findpair(int arr[], int n){
        int size =arr.length;
        int i=0,j=1;
        while(i<size&&j<size){
            if (i!=j && arr[j]-arr[i]==n){
                System.out.println("par encontrado: "+arr[i]+"-"+arr[j]);
                return true;
            }else if(arr[j]-arr[i]<n){
                j++;
            }else {
                i++;
            }
        }
        System.out.println("par no encontrado");
        return false;
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int arr[]={1,8,30,40,100};
         int n=60;
         findpair (arr,n);
         
     }
}
