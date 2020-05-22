package cap3.sorting;

import java.util.Arrays;

public class _2SortingNumbers {

	public static void main(String[] args) {
		
		int[] numbers = {3, 6, 9, 1, 0};
		
		Arrays.sort(numbers);
		
		for (int i=0; i < numbers.length; i++)
			System.out.println(numbers[i] + " ");
	}
}
