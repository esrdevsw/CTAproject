package ie.gmit.cta;
//https://www.w3schools.com/java/java_files_create.asp

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class RecordOut {

	public void WriterData(String fileName, String dataRecord) {
		try {
			FileWriter myWriter = new FileWriter(fileName);
			myWriter.write(dataRecord);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	// Method 1 -->
	// https://www.geeksforgeeks.org/java-program-to-append-a-string-in-an-existing-file/#:~:text=In%20Java%2C%20we%20can%20append,for%20file%20handling%20in%20Java.
	// TO append string into a file
	public void appendStrToFile(String fileName, String str) {
		// Try block to check for exceptions
		try {

			// Open given file in append mode by creating an
			// object of BufferedWriter class
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

			// Writing on output stream
			out.write(str);
			// Closing the connection
			out.close();
		}

		// Catch block to handle the exceptions
		catch (IOException e) {

			// Display message when exception occurs
			System.out.println("exception occurred" + e);
		}
	}

	public void recordDat(String nameFile, int[] sizeTest, long[][] testResult) {
		float sum = 0;
		int totallength = 0;
		for (int i = 0; i < testResult.length; i++) { // this equals to the row in our matrix.
			for (int j = 0; j < testResult[i].length; j++) { // this equals to the column in each row.
//				System.out.print(String.format("%.1l", testResult[i][j]) + " ");
				// record data
				appendStrToFile(nameFile, (testResult[i][j]) + " ");
				sum = sum + testResult[i][j];
				totallength++;
			}
//			System.out.println(); // change line on console as row comes to end in the matrix.

			// record data
			appendStrToFile(nameFile,
					" >>> " + sizeTest[i] + " " + (String.format("%.3f", ((sum / totallength) / 1000000))) + "\n");
			totallength = 0;
			sum = 0;
		}

	}

	public void recordDatEnd(String nameFile, double[][] testResult2, int[] sizeTest) {

		System.out.println("Size " + Arrays.toString(sizeTest));

		appendStrToFile(nameFile, "Size [");
		for (int i = 0; i < sizeTest.length; i++) {
			appendStrToFile(nameFile, (sizeTest[i]) + " ");
		}
		appendStrToFile(nameFile, "]\n");

		String[] nameAlg = { "Bubble [", "Selection [", "Quick [", "Counting [", "Radix ["};

		for (int i = 0; i < testResult2.length; i++) { // this equals to the row in our matrix.

			System.out.print(nameAlg[i] + " ");
			appendStrToFile(nameFile, ((nameAlg[i])) + " ");

			for (int j = 0; j < testResult2[i].length; j++) { // this equals to the column in each row.

				System.out.print(String.format("%.3f", (testResult2[i][j])) + " ");

				appendStrToFile(nameFile, (String.format("%.3f", (testResult2[i][j])) + " "));
			}
			appendStrToFile(nameFile, "]\n");
			System.out.println("]"); // change line on console as row comes to end in the matrix.

		}

	}
}
