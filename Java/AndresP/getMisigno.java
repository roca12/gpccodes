 public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,7,8};
        int missed=getMisigno(a, a.length);
        System.out.println("numero perdido"+missed);
        
 static int getMisigno(int a[],int n){
        int x1=a[0];
        int x2=1;
        for (int i = 1; i < n; i++) {
            x1^=a[i];
        }
        for (int i = 2; i <=n+1; i++) {
            x2^=i;
            
        }
        return x1^x2;
    }
