public class new {
    public static void main(String[] args) {
int leftbo,rightbo,resultado,x;
int arr[]={1,2,3,4,5,6,7,8,9,10};
leftbo=0;
rightbo=arr.length-1;
x=50;
resultado=ternarySerch(leftbo, rightbo, x, arr);
        if (resultado==-1) {
            System.out.println("no existe el dato en el arreglo");
        }else{
            System.out.println("encontrado en el indice"+resultado);
        }


    }
static int ternarySerch(int leftbo,int rightbo,int x, int arr[]){
    if (rightbo>=leftbo) {
        int mid1=leftbo+(rightbo-leftbo)/3;
        int mid2=rightbo-(rightbo-leftbo)/3;
        if (arr[mid1]== x) {
            return mid1;
        }
        if (arr[mid2]== x) {
            return mid2;
        }
        if (x<arr[mid1]) {
            return ternarySerch(leftbo, mid1-1, x, arr);
            
        }else if(x>arr[mid2]){
            return ternarySerch(mid2+1, rightbo, x, arr);
            
            
        }else{
            return ternarySerch(mid1+1, mid2-1, x, arr);
        }
        
    }
    return -1;
}    
}
