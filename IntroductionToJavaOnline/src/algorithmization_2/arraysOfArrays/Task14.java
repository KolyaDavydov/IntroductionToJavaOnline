package algorithmization_2.arraysOfArrays;

import java.util.Arrays;

//14.  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//     единиц равно номеру столбца

public class Task14 {

  public static void main(String[] args) {
      int n = (int) (Math.random() * 5) + 3;
      int m = (int) (Math.random() * 5) + 3;
      int[][] matrix = new int[n][m];

      for(int j = 0; j < matrix[n - 1].length; j++) {
    	  for (int i = 0; i < matrix.length - 1; i++) {
              int counter = 0;
              while(counter <= j) {
            	  
              }
          }
      }
      
      System.out.println("Исходная матрица имеет вид:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
      }

  }
}  