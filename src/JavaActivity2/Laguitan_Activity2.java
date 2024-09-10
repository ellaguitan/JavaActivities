package JavaActivity2;

import java.util.Arrays;

public class Laguitan_Activity2 {

	public static int[] findIndices(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		
		System.out.println("No matches found.");
		return null;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int target = 5;
		
		int[] result = findIndices(arr, target);
		
		if(result.length != 0) {
			System.out.println("Indices are: " + Arrays.toString(result));
		}
	}
}