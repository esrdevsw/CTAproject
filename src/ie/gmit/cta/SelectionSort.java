package ie.gmit.cta;

//import java.util.Arrays;

// https://stackabuse.com/sorting-algorithms-in-java/
public class SelectionSort {

	public int[] selectionSort(int[] arr) {
		int n = arr.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			// Swap the found minimum element with the first
			// element
//			System.out.println(min_idx);
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
//			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

}
