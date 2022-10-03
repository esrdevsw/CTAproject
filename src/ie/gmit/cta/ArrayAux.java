package ie.gmit.cta;

public class ArrayAux {

	public void arrayCopy(int[] oldArray, int[] newArray) {
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}

	// A utility function to swap two elements
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void reset(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = 0;
	}

	public int maxValueArray(int[] inputArray) {
		int max = inputArray[0];
		// Loop through the array
		for (int i = 0; i < inputArray.length; i++) {
			// Compare elements of array with max
			if (inputArray[i] > max)
				max = inputArray[i];
		}
		int min = max;
		// Loop through the array
		for (int i = 0; i < inputArray.length; i++) {
			// Compare elements of array with max
			if (inputArray[i] < min)
				min = inputArray[i];
		}
		System.out.println("Largest element present in given array: " + max);
		System.out.println("the smallest element present in given array: " + min);
		return max;
	}

//	Check if array is sorted (https://www.techiedelight.com/check-array-sorted-java/)
	public boolean isSorted(int[] a) {
		// base case
		if (a == null || a.length <= 1) {
			return true;
		}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public void transpose(float[][] original) {
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n matrix transpose:\n");
		// transpose
		if (original.length > 0) {
			for (int i = 0; i < original[0].length; i++) {
				for (int j = 0; j < original.length; j++) {
					System.out.print(original[j][i] + " ");
				}
				System.out.print("\n");
			}
		}
	}

	public void avgSort(long[][] testResult, int index, int[] arrayTestSizes, double[][] testResult2) {

		float sum = 0;
		int totallength = 0;
		for (int i = 0; i < testResult.length; i++) { // this equals to the row in our matrix.
			for (int j = 0; j < testResult[i].length; j++) { // this equals to the column in each row.
				sum = sum + testResult[i][j];
				totallength++;
			}
			// record data
			testResult2[index][i] = ((sum / totallength) / 1000000);
			System.out.println(
					" >>> " + arrayTestSizes[i] + " " + (String.format("%.3f", ((sum / totallength) / 1000000))));
			totallength = 0;
			sum = 0;
		}
	}

}
