//Funcionamiento dado solo para positivos
public class Find_Duplicates_Bit_Array {

    static class BitArray{
        int arr[];
        public BitArray(int n){
            arr = new int[(n >> 5) + 1];
        }
        boolean get(int pos){
            int index = (pos >> 5);
            int bitNo = (pos & 0x1F);
            return (arr[index] & (1 << bitNo)) != 0;
        }
        
        void set(int pos){
            int index = (pos >> 5);
            int bitNo = (pos & 0x1F);
            arr[index] |= (1 << bitNo);
        }
        
       void checkDuplicates(int arr[], BitArray ba){
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i] - 1;
                if(ba.get(num)){
                    System.out.println((num + 1)+" ");
                }else{
                    ba.set(num);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 10, 1, 1, 2, 3};
        BitArray ba = new BitArray(32000);
        ba.checkDuplicates(arr, ba);
    } 
}
