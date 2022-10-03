package ie.gmit.cta;

import java.util.Arrays;

public class SortingAlg {

	public static void main(String[] args) {

		BubbleSort BS = new BubbleSort();
		SelectionSort SS = new SelectionSort();	
		QuickSort QS = new QuickSort();
		CountingSort CS = new CountingSort();
		RadixSort RS = new RadixSort();	// use counting	
			
		
		ArrayAux AA = new ArrayAux();

//		int[] arr0 = { 10, 7, 8, 9, 8, 1, 5, -15 };
//
//		System.out.println(AA.isSorted(arr0));
//
//		BS.bubbleSort(arr0);
//
//		System.out.println(Arrays.toString(arr0));
//		System.out.println(AA.isSorted(arr0));
		RandonGenerator R = new RandonGenerator();
//		int[] arr =  R.RandomArr(12);
		int[] arr = { 910, 17, 333, 307, 330, 100, 30, 38, 9, 130, 1};
//		int[] arr = { 9, 8, 7,  6, 5, 4, 3, 2, 1, 0};
//		int[] arr = { 7, 38, 13 , 47 , 18, 27, 33};
//		int[] arr = { 7, 38, 13 , 47 , 18, 27, 33};
		
		System.out.println(Arrays.toString(arr));

//		System.out.println(AA.isSorted(arr));

//		SS.selectionSort(arr);
//		QS.quickSort(arr, 0, (arr.length -1));
//		CS.countSort(arr, arr.length);
		RS.radixSort(arr, arr.length);

		System.out.println(Arrays.toString(arr));
		System.out.println(AA.isSorted(arr));
		
//		

	}

}
