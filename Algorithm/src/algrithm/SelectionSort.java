package algrithm;

import java.util.Arrays;

public class SelectionSort {
	// 재귀함수 
	public static void selectionsort(int [] array) {
		selectionsort(array, 0);
	}
	public static void selectionsort(int [] array, int start) {
		int min = start;
		for (int i = start; i < array.length; i++) {
			if (array[min] > array[i]) {
				min = i;
			}
		}
		swap(array, start, min); // 정렬
		if (start < array.length-1) {
			selectionsort(array, start+1);
		}
	}
	// 변수 교환 함수
	public static void swap(int [] array, int start, int min) {
		int temp = array[start];
		array[start] = array[min];
		array[min] = temp;
	}

	public static void main(String[] args) {
		int [] array = {10,3,8,7,4,5,6,9,2,1};
		selectionsort(array);
		System.out.println(Arrays.toString(array));

	}

}
