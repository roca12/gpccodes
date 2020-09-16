public class Main {

    static void combinationUtil(int arr[], int data[], int start,
            int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    static void combination(int arr[], int n, int r) {
        int data[] = new int[r];
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    static void CombinationRepetitionUtil(int chosen[], int arr[], int index, int r, int start, int end) {
        if (index == r) {
            for (int i = 0; i < r; i++) {
                System.out.printf("%d ", arr[chosen[i]]);
            }
            System.out.printf("\n");
            return;
        }
        for (int i = start; i < end; i++) {
            chosen[index] = i;
            CombinationRepetitionUtil(chosen, arr, index + 1, r, i, end);
        }
        return;
    }

    static void CombinationRepetition(int arr[], int n, int r) {
        int chosen[] = new int[r + 1];
        CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1);
    }

    public static void main(String[] args) {
        //Sin repetición
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        combination(arr, n, r);
        //Con repetición
        int arr2[] = {1, 2, 3, 4};
        int n2 = arr.length;
        int r2 = 2;
        CombinationRepetition(arr2, n2, r2);
    }
}
