package ie.gmit.cta;

// Random number = Minimum number + generate Random(Maximum number-Minimum number)

import java.util.Random;

public class RandonGenerator {

	public int[] RandomArr( int numberMax) {
		Random r = new Random();
		int[] arrNumber = new int[numberMax];
		for (int i = 0; i < arrNumber.length; i++) {
			arrNumber[i] = r.nextInt(numberMax);			
		}
		return arrNumber;
	}
	
}

