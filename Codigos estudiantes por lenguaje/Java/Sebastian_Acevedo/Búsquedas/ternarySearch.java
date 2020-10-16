import java.util.Scanner;

public class Main{
        
    public static void main(String[] args){
        int left,right,p,key;
        int ar[] ={1,2,3,4,5,6,7,8,9,10};
        left=0;
        right=9;
        key=5;
        p=ternaySearch(left, right, key, ar);
        System.out.println("Indice de "+key+" es "+ p);
        key=50;
        p=ternaySearch(left, right, key, ar);
        System.out.println("Index of "+key+" is "+p);
    }
    
    static int ternaySearch(int left, int right, int key, int arr[]){
        if(right>=left){
            int mid1=left+(right-left)/3;
            int mid2=left+(right-left)/3;
            if(arr[mid1]==key){
                return mid1;
            }
            if(arr[mid2]==key){
                return mid2;
            }
            if(key<arr[mid1]){
                return ternaySearch(left, mid1-1, key, arr);
            }else if(key>arr[mid2]){
                return ternaySearch(mid2+1, right, key, arr);
            }else{
                return ternaySearch(mid1+1, mid2-1, key, arr);
            }             
        }
        return -1;
    }
}

