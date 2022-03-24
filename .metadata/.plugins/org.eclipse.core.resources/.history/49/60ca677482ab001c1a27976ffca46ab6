package algorithmization_2.arraysOfArrays;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int n = 8;
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = j + 1;

			}
		}

		System.out.println("Имеется исходный массив:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
			System.out.println();
		}

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите два номера столбцов которые хотите поиенять от 1 до " + n);
			int replaceFirst = scanner.nextInt();
			int replaceSecond = scanner.nextInt();

			int[][] matrixReplace = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					matrixReplace[i][j] = matrix[i][j];
					matrixReplace[i][replaceFirst - 1] = matrix[i][replaceSecond - 1];
					matrixReplace[i][replaceSecond - 1] = matrix[i][replaceFirst - 1];
				}
			}

			System.out.println("Выводим Массив после перестановок столбцов:");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(" " + matrixReplace[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}


