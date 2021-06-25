package algrithm;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int [] array) {
		insertionSort(array, array.length-1);
	}
	public static void insertionSort(int [] array, int end) {
		int min = end;
		for (int i = end-1; i >= 0; i--) {
			if(array[min] < array[i]) {
				swap(array, min, i);
			}
		}
		if (end > 0) {
			insertionSort(array, end-1);
		}
	}
	
	public static void swap(int [] array, int min, int i) {
		int temp = array[min];
		array[min] = array[i];
		array[i] = temp;
		
	}

	public static void main(String[] args) {
		int [] array = {2,3,7,8,4,5,6,9,10,1};
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
