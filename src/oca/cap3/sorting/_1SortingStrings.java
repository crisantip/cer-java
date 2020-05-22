package oca.cap3.sorting;

import java.util.Arrays;

public class _1SortingStrings {

	public static void main(String[] args) {
		
		String[] strings = {"abc", "aBc", "2", "Abc", "ABC", "1"};

		Arrays.sort(strings);
		
		for (String string: strings)
			System.out.println(string + " ");
	}
}
