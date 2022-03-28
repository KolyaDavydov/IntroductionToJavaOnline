package algorithmization_2.arraysOfArrays;

import java.util.Arrays;

public class Task16 {

	public static void main(String[] args) {
		int order = 3;
		squareOddOrder(order);

	}
	public static void squareOddOrder (int order) {
		int matrix[][] = new int[order][order];
		
		int i = order - 1;
		int j = matrix.length / 2;
		for (int k = 1; k < order * order; k++) {
			
			
			if(i < 0 && j < 0) {
				i = order - 1;
				j = order - 1;
			}
			else if(j < 0) {
				j = order - 1;
			}
			else if(j > order - 1) {
				j = 0;
			}
			else if(i < 0) {
				i = order - 1;
			}
			else if(i < 0 && j < 0) {
				i = order - 1;
				j = order - 1;
			}
			else if(k == order) {
				j++;			
			}
			
			matrix[i][j] = k;
			i--;
			j--;
		}
		
		System.out.println("Matrix looks like:");
	      for(int v = 0; v < matrix.length; v++) {
				System.out.println(Arrays.toString(matrix[v]));
	      }
	}

}
