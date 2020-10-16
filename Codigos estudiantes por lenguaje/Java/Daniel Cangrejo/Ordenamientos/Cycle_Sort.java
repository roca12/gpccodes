//CYCLE_SORT
public class Ordenamientos2_6 {
	
	static void cycleSort(int arr[], int n) {
		int writes = 0;
		for (int cyclestart = 0; cyclestart < n-2; cyclestart++) {
			int item = arr[cyclestart];
			int pos = cyclestart;
			for (int i = cyclestart+1; i < n; i++) {
				if(arr[i] < item) {
					pos++;
				}
			}
			if(pos == cyclestart) {
				continue;
			}
			while(item == arr[pos]) {
				pos++;
			}
			if (pos != cyclestart) {
				int temp = item;
				item = arr[pos];
				arr[pos] = temp;
				writes++;
			}
			while(pos != cyclestart) {
				pos = cyclestart;
				for (int i = cyclestart+1; i < n; i++) {
					if(arr[i] < item) {
						pos++;
					}
				}
				while(item == arr[pos]) {
					pos++;
				}
				if(item != arr[pos]) {
					int temp = item;
					item = arr[pos];
					arr[pos] = temp;
					writes++;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 8, 3, 9, 10, 10, 2, 4, 5, 5};
		int n = arr.length;
		cycleSort(arr, n);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
