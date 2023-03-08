package com.ajas.sorting;


public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {10,3,8,4,9};
	
		BubbleSort.bubbleSort(array);
		BubbleSort.bubbleSorting();
		
	} 
	
	public static void bubbleSort(int[] array) {
		
		int length = array.length;	
		for (int i = 0; i < length-1; i ++) {
			
			for(int j=0 ;j<length-1-i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void bubbleSorting() {
		int[]array = {1,9,8,7,4,2,3,6};
		
		for (int i=0; i<array.length -1; i++) {
			int counter = 0;
			for(int j= 0; j < array.length -1; j++ ) {
				counter++;
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println(counter);
		}
		for (int i : array) {
			System.err.println(i);
		}
		
	}
}
