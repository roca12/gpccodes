public class Main {

    static int maxSubarrayXOR(int arr[], int n) {
        int ans = Integer.MIN_VALUE; // Inicializar resultado 
        // Escogiendo puntos de inicio para los subarreglos
        for (int i = 0; i < n; i++) {
            // para guardar XOR del actual subarreglo
            int curr_xor = 0;
            // Escogiendo puntos finales de subArreglos empezando por i
            for (int j = i; j < n; j++) {
                curr_xor = curr_xor ^ arr[j];
                ans = Math.max(ans, curr_xor);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {8, 1, 2, 12, 0, 3, 4, 5, 12, 1221};
        int n = arr.length;
        System.out.println("Maximo subarray XOR es " + maxSubarrayXOR(arr, n));
    }
}
