package algorithmization_2.oneDimensionalArrays;

/* 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
*/

public class Task6 {

	public static void main(String[] args) {
		int sizeArray = 11;
		double[] array = new double[sizeArray];
		double sum = 0;
		for(int i = 0; i < sizeArray; i++) {
			array[i] = Math.random() * 20;
		}
		
		for(int i = 1; i < sizeArray; i++) {
			if(isPrime(i)) {
				sum = sum + array[i];
			}
		}
		for (double n : array) {
			System.out.println(n);	
		}
		
		System.out.println(sum);		
	}
	
	
	static boolean isPrime(int num) {
		int devider = 2;
		while(devider < num) {
			if((num + 1) % devider == 0) {
				return false;
			}
			devider++;
		}
		return true;
	}
}
