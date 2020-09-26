public class Main {
    public static void main(String[] args) {
        //definir arreglo
       int vec[]=new int[10];
       for(int i=0;i<vec.length;i++){
           vec[i]=i*i;
       }
       for(int i=0;i<vec.length;i++){
           System.out.println(vec[i]);
       }
    }
}
