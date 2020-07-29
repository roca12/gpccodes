 
 public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,7,8};
        int missed=getMisigno(a, a.length);
        System.out.println("numero perdido"+missed);
       
       
    }
 static boolean  finpair(int arr[],int x){
        int size=arr.length;
        int i=0,j=1;
        while (i<size&&j<size) {            
            if (i!=j&&arr[i]==x) {
                System.out.println("par encontrado: "+"("+arr[i]+"-"+arr[j]+")");
                return true;
            }
            else if(arr[j]-arr[i]<x){
                j++;               
            }else{
                j++;
            }
            
        }
        System.out.println("no existe el par q debe ser igual a n al rstar");
        return false;
    }
}
