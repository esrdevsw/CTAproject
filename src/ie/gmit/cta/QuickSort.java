package ie.gmit.cta;

//import java.util.Arrays;

// https://stackabuse.com/sorting-algorithms-in-java/
public class QuickSort {
	static int partition(int[] array, int begin, int end) {
		int pivot = end;
//		System.out.println("pivot --> " + array[pivot]);
		int counter = begin;
		for (int i = begin; i < end; i++) {
			if (array[i] < array[pivot]) {
				int temp = array[counter];
				array[counter] = array[i];
				array[i] = temp;
//				System.out.println("change element --> " + temp);
				counter++;
			}
		}
		int temp = array[pivot];
		array[pivot] = array[counter];
		array[counter] = temp;
//		System.out.println(Arrays.toString(array));
		return counter;
	}

	public void quickSort(int[] array, int begin, int end) {
		if (end <= begin)
			return;
		int pivot = partition(array, begin, end);
		quickSort(array, begin, pivot - 1);
		quickSort(array, pivot + 1, end);
	}
}