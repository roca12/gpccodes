//cocktail_sort
public class Ordenamientos2_2 {
	
	static void cocktailSort(int a[]) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;
        while (swapped == true) {
            swapped = false;
            for (int i = start; i < end - 1; i++) {
            	//cambiar ">" aqui  si lo quiero de mayor a menor
            	if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
            swapped = false;
            end -= 1;
            for (int i = end - 1; i >= start; i--) {
               //cambiar ">" aqui tambien si lo quiero de mayor a menor
            	if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            start += 1;
        }
    }

    static void printArray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {5, 1, 4, 2, 8, 0, 2};
        printArray(a);
        cocktailSort(a);
        printArray(a);
    }
}
