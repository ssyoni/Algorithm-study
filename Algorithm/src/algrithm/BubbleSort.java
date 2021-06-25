package algrithm;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int [] array) {
		bubbleSort(array, array.length);
	}
	
	public static void bubbleSort(int [] array,  int end) {
		 for (int i = 1; i < end; i++) {
			if (array[i] < array[i-1]) {
				swap(array, i-1, i);
			}
		}
		 if (end > 0) {
			 bubbleSort(array, end-1);
		 }
	}
	
	public static void swap(int [] array, int prev, int i) {
		int temp = array[i];
		array[i] = array[prev];
		array[prev] = temp;
	}

	public static void main(String[] args) {
		int [] array = {2,3,7,8,4,5,6,9,10,1};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

}
