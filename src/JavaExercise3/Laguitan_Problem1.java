package JavaExercise3;

import java.util.Arrays;

public class Laguitan_Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 10;
		double[] fractions = new double[ARRAY_SIZE];
		
		System.out.println("fractions[4] = " + fractions[4]);
		
		fractions[9] = 1.667;
		fractions[6] = 3.333;
		
		double sum = 0;
		
		for (int x = 0; x < fractions.length; x++) {
			sum += fractions[x];
		}
		
		System.out.println("sum = " + sum);
		
	}

}
