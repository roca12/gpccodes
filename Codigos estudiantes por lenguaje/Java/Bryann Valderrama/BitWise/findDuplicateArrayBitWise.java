public class Main {

    static class BitArray {

        int[] arr;

        public BitArray(int n) {
            arr = new int[(n >> 5) + 1];
        }

        boolean get(int pos) {
            int index = (pos >> 5);
            int bitNo = (pos & 0x1f);
            return (arr[index] & (1 << bitNo)) != 0;
        }

        void set(int pos) {
            int index = (pos >> 5);
            int bitNo = (pos & 0x1f);
            arr[index] |= (1 << bitNo);
        }

        static void checkDuplicates(int[] arr) {
            BitArray ba = new BitArray(32000);
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i] - 1;
                if (ba.get(num)) {
                    System.out.print((num + 1) + " ");
                } else {
                    ba.set(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BitArray.checkDuplicates(arr);
    }
}
