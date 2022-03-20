package algorithmization_2.oneDimensionalArrays;

/* 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
*/


public class task5 {

	public static void main(String[] args) {
		int[] array = new int[100];
		int k = 78;
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 99 + 1);
		}
		
		for (int num : array) {
			if(num > k) {
				System.out.println(num);	
			}
		}
	}
}
