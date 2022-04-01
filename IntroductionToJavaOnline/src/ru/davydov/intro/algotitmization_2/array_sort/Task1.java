package ru.davydov.intro.algotitmization_2.array_sort;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		int lengthArray_1 = 7;
=======
		int lengthArray_1 = 8;
>>>>>>> 3baa93935564b076039b95e88f459912f131e9a8
		int lengthArray_2 = 4;
		int k = 4;
		
		int[] array_1 = new int[lengthArray_1];
		int[] array_2 = new int[lengthArray_2];
		
		for(int i = 0; i < lengthArray_1; i++) {
			array_1[i] = (int) (Math.random() * 10);
		}
		System.out.println("First array:\n" + Arrays.toString(array_1));
		
		for(int i = 0; i < lengthArray_2; i++) {
			array_2[i] = (int) (Math.random() * 20);
		}
		System.out.println("\nSecond array:\n" + Arrays.toString(array_2));
<<<<<<< HEAD
		
		
		
		System.out.println("\nSummary array:\n" + Arrays.toString(concatanateArrays(array_1, array_2, k)));
=======
>>>>>>> 3baa93935564b076039b95e88f459912f131e9a8

	}

	
	
	public static int[] concatanateArrays(int[] srcArray1, int[] srcArray2, int numOfPosition) {
		int[] destArray = new int[srcArray1.length + srcArray2.length];
		System.arraycopy(srcArray1, 0, destArray, 0, numOfPosition);
		System.arraycopy(srcArray2, 0, destArray, numOfPosition, srcArray2.length);
		System.arraycopy(srcArray1, numOfPosition, destArray, numOfPosition + srcArray2.length, srcArray1.length - numOfPosition);
				
		return destArray;
	}
}

