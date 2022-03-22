package algorithmization_2.oneDimensionalArrays;

/* 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
*/

public class Task2 {

	public static void main(String[] args) {
		double[] array = new double[100];
		int counter = 0;
		double k = 10.1;
		for(int i = 0; i < 100; i++) {
			array[i] = Math.random() * 20;
		}
		for(int i = 0; i < 100; i++) {
			if(array[i] > k) {
				counter++;
				array[i] = k;
			}
		}
		System.out.println("Number of replacements: " + counter);
	}

}
