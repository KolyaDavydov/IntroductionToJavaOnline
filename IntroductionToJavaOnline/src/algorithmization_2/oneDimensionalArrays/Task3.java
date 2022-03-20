package algorithmization_2.oneDimensionalArrays;

/* 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
*/

public class Task3 {

	public static void main(String[] args) {
		double[] array = new double[100];
		int counterPositive = 0;
		int counterNegative = 0;
		int counterZero = 0;
		for(int i = 0; i < 100; i++) {
			array[i] = Math.random() * 200 - 100;
		}
		for(int i = 0; i < 100; i++) {
			if(array[i] > 0) {
				counterPositive++;
			}
			else if (array[i] < 0) {
				counterNegative++;
			}
			else {
				counterZero++;
			}
		}
		System.out.println("���������� ������������� ���������: " + counterPositive);
		System.out.println("���������� ������������� ���������: " + counterNegative);
		System.out.println("���������� ������� ���������: " + counterZero);

	}

}
