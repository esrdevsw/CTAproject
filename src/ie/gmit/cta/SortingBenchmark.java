package ie.gmit.cta;

public class SortingBenchmark {

	public static void main(String[] args) {

		RandonGenerator RG = new RandonGenerator();
		ArrayAux AA = new ArrayAux();
		RecordOut Rtext = new RecordOut();

		// call sorting algorithms
		BubbleSort BS = new BubbleSort();
		SelectionSort SS = new SelectionSort();
		QuickSort QS = new QuickSort();
		CountingSort CS = new CountingSort();
		RadixSort RS = new RadixSort(); // use counting

		// Number of tests per algorithm
		int testNumber = 10;

		// total number of algorithms
		int numberAlgorithms = 5;

		// Array with the sizes of the data that will be used in the tests
//		int[] arrayTestSizes = { 10, 25, 50 };
//		int[] arrayTestSizes = { 100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
//		int[] arrayTestSizes = { 100, 200, 300, 400, 500, 600, 700, 800, 1000, 1200, 1500, 2000, 3000, 5000, 7500, 10000, 12500, 25000, 50000, 75000, 100000, 125000, 250000, 375000, 500000 };
		int[] arrayTestSizes = { 100, 200, 300, 400, 500, 600, 700, 800, 1000, 1200, 1500, 2000, 3000, 5000, 7500, 10000, 12500, 25000, 50000, 75000, 100000, 125000, 150000, 175000, 200000, 225000, 250000, 275000, 300000, 325000, 350000, 375000, 400000, 450000, 500000 };

		// Store test results for each iteration
//		long[][] testResult = new long[arrayTestSizes.length][testNumber];

		long[][] testResultBS = new long[arrayTestSizes.length][testNumber];
		long[][] testResultSS = new long[arrayTestSizes.length][testNumber];
		long[][] testResultQS = new long[arrayTestSizes.length][testNumber];
		long[][] testResultCS = new long[arrayTestSizes.length][testNumber];
		long[][] testResultRS = new long[arrayTestSizes.length][testNumber];

		// Store the average results of each iteration set by array size for each
		// algorithm
		double[][] testResult2 = new double[numberAlgorithms][arrayTestSizes.length];

		// initialize the test array with the size of the maximum test value
		int[] testArray = new int[AA.maxValueArray(arrayTestSizes)];

		int maxValue = AA.maxValueArray(arrayTestSizes);

		// fill an array with random values
		testArray = RG.RandomArr(maxValue);

		// one iteration for each array size
		for (int row = 0; row < arrayTestSizes.length; row++) {

			System.out.println(
					">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   " + arrayTestSizes[row]);
			// Create a test array with the number of elements of each test in each
			// iteration
			int[] testNew = new int[arrayTestSizes[row]];

			// run 10 tests for each array size (Bubble Sort)
			for (int col = 0; col < testResultBS[row].length; col++) {

				// Copy part of the data from the initial array
				AA.arrayCopy(testArray, testNew);

//				System.out.println(Arrays.toString(testNew));

				long startTime = System.nanoTime();
				BS.bubbleSort(testNew);
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				testResultBS[row][col] = (timeElapsed);

//				System.out.println(Arrays.toString(testNew));

				System.out.println("Is sorted: " + AA.isSorted(testNew));
				AA.reset(testNew); // rewrite array to zero value

			}

			System.out.println("===========================================================================");

			AA.reset(testNew); // rewrite array to zero value
			// run 10 tests for each array size (Selection Sort)
			for (int col = 0; col < testResultSS[row].length; col++) {

				// Copy part of the data from the initial array
				AA.arrayCopy(testArray, testNew);

//				System.out.println(Arrays.toString(testNew));

				long startTime = System.nanoTime();
				SS.selectionSort(testNew);
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				testResultSS[row][col] = (timeElapsed);

//				System.out.println(Arrays.toString(testNew));

				System.out.println("Is sorted: " + AA.isSorted(testNew));
				AA.reset(testNew); // rewrite array to zero value

			}

			System.out.println("===========================================================================");

			AA.reset(testNew); // rewrite array to zero value
			// run 10 tests for each array size (Quick Sort)
			for (int col = 0; col < testResultQS[row].length; col++) {

				// Copy part of the data from the initial array
				AA.arrayCopy(testArray, testNew);

//				System.out.println(Arrays.toString(testNew));

				long startTime = System.nanoTime();
				QS.quickSort(testNew, 0, (testNew.length - 1));
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				testResultQS[row][col] = (timeElapsed);

//				System.out.println(Arrays.toString(testNew));

				System.out.println("Is sorted: " + AA.isSorted(testNew));
				AA.reset(testNew); // rewrite array to zero value

			}

			System.out.println("===========================================================================");

			AA.reset(testNew); // rewrite array to zero value
			// run 10 tests for each array size (Counting Sort)
			for (int col = 0; col < testResultCS[row].length; col++) {

				// Copy part of the data from the initial array
				AA.arrayCopy(testArray, testNew);

//				System.out.println(Arrays.toString(testNew));

				long startTime = System.nanoTime();
				CS.countSort(testNew, testNew.length);
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				testResultCS[row][col] = (timeElapsed);

//				System.out.println(Arrays.toString(testNew));

				System.out.println("Is sorted: " + AA.isSorted(testNew));
				AA.reset(testNew); // rewrite array to zero value

			}

			System.out.println("===========================================================================");

			AA.reset(testNew); // rewrite array to zero value
			// run 10 tests for each array size (Radix Sort)
			for (int col = 0; col < testResultRS[row].length; col++) {

				// Copy part of the data from the initial array
				AA.arrayCopy(testArray, testNew);

//				System.out.println(Arrays.toString(testNew));

				long startTime = System.nanoTime();
				RS.radixSort(testNew, testNew.length);
				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				testResultRS[row][col] = (timeElapsed);

//				System.out.println(Arrays.toString(testNew));

				System.out.println("Is sorted: " + AA.isSorted(testNew));
				AA.reset(testNew); // rewrite array to zero value

			}

			System.out.println("===========================================================================");

			AA.reset(testNew); // rewrite array to zero value
		}
		String nameFile = ("Test_Sort2.dat");
		Rtext.appendStrToFile(nameFile, "\n");
		Rtext.appendStrToFile(nameFile, ">>>>>>>>>>>>> Bubble Sort" + "\n");
		Rtext.recordDat(nameFile, arrayTestSizes, testResultBS);

		Rtext.appendStrToFile(nameFile, "\n");
		Rtext.appendStrToFile(nameFile, ">>>>>>>>>>>>> Selection Sort" + "\n");
		Rtext.recordDat(nameFile, arrayTestSizes, testResultSS);

		Rtext.appendStrToFile(nameFile, "\n");
		Rtext.appendStrToFile(nameFile, ">>>>>>>>>>>>> Quick Sort" + "\n");
		Rtext.recordDat(nameFile, arrayTestSizes, testResultQS);

		Rtext.appendStrToFile(nameFile, "\n");
		Rtext.appendStrToFile(nameFile, ">>>>>>>>>>>>> Counting Sort" + "\n");
		Rtext.recordDat(nameFile, arrayTestSizes, testResultCS);

		Rtext.appendStrToFile(nameFile, "\n");
		Rtext.appendStrToFile(nameFile, ">>>>>>>>>>>>> Radix Sort" + "\n");
		Rtext.recordDat(nameFile, arrayTestSizes, testResultRS);

		AA.avgSort(testResultBS, 0, arrayTestSizes, testResult2);
		AA.avgSort(testResultSS, 1, arrayTestSizes, testResult2);
		AA.avgSort(testResultQS, 2, arrayTestSizes, testResult2);
		AA.avgSort(testResultCS, 3, arrayTestSizes, testResult2);
		AA.avgSort(testResultRS, 4, arrayTestSizes, testResult2);

		Rtext.appendStrToFile(nameFile, "\n");
		Rtext.appendStrToFile(nameFile, ">>>>>>>>>>>>> Final <<<<<<<<<<<<<<<<<<<" + "\n");
		Rtext.recordDatEnd(nameFile, testResult2, arrayTestSizes);

	}

}