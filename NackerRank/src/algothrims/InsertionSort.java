package algothrims;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) throws Exception{
		int[] input = {3, 7, 4, 9, 5, 2, 6, 1};
		System.out.println("Input Array : " + Arrays.toString(input));
		int[] result = insertionSort(input);
		System.out.println("Input Array : " + Arrays.toString(result));
	} 
	
	public static int[] insertionSort(int[] inputArray) throws Exception{
		for(int i = 1; i < inputArray.length; i++){
			int j = i;
			do{
				checkAndSwap(inputArray, j - 1, j);
				j--;
			}while(j >= 1);
		}
		return inputArray;
	}
	
	public static void checkAndSwap(int[] inputArray,int firstIndex,int secondIndex) throws Exception{
		if(isSecondValueLessThanFirstValue(inputArray, firstIndex, secondIndex)){
			swap(inputArray, firstIndex, secondIndex);
		}
	}
	
	public static void swap(int[] inputArray,int firstIndex,int secondIndex) throws Exception{
		int firstValue = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = firstValue;
	}
	
	public static boolean isSecondValueLessThanFirstValue(int[] inputArray,int firstIndex,int secondIndex) throws Exception{
		return inputArray[secondIndex] < inputArray[firstIndex];
	}
}


