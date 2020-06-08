public class Binary_search {

    
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in); 
     int vector[]= {2,3,4,5,6};
        int n=vector.length;
        int busqueda=2;
        int resultado = binarysearch(vector, 0, n-1, busqueda);
        if(resultado==-1) {
            System.out.println("Elemento no encontrado");
        }else {
            System.out.println("Elemento encontrado en la posicion "+resultado);
        }
        
    }
    
static int binarysearch(int vector[],int l,int r,int x) {
        if (r>=l) {
            int sum=l+(r-1)/2;
            if(vector[sum]==x) {
                return sum;
            }
            if(vector[sum]>x) {
                return binarysearch(vector, l, sum-1, x);
            }else {
                return binarysearch(vector, sum+1, r, x);
            }
        }
        return -1;
    }
    
}    


