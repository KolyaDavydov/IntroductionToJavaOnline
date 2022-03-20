package algorithmization_2.oneDimensionalArrays;

import java.util.Arrays;

/*
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
*/

public class Task9 {

	public static void main(String[] args) {
		int sizeArray = 20;
		int[] array = new int[sizeArray];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 - 7);
		}
		System.out.println("�������� ������: " + Arrays.toString(array));
		
		int[] arrayOfRepet = new int[sizeArray];
		int counterOfRepet = 1;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] == array[i] && j != i) {
					counterOfRepet++;
				}	
			}
			arrayOfRepet[i] = counterOfRepet;
			counterOfRepet = 1;
		}
		System.out.println("������ ���������� ���������� � �������� �������: " + Arrays.toString(arrayOfRepet));
		
		int maxRepet = Integer.MIN_VALUE;
		for(int i = 0; i < arrayOfRepet.length; i++) {
			if(arrayOfRepet[i] > maxRepet) {
				maxRepet = arrayOfRepet[i];
			}
		}
		System.out.println("������������ ���������� ����������: " + maxRepet);
		
		int counter = 0;
		for(int i = 0; i < arrayOfRepet.length; i++) {
			
			if(arrayOfRepet[i] == maxRepet) {
				//[counter] = array[i];
				counter++;
			}
		}
		int[] numWithMaxOfRepet = new int[counter];
		
		int count = 0;
		for(int i = 0; i < arrayOfRepet.length; i++) {
					
					if(arrayOfRepet[i] == maxRepet) {
						numWithMaxOfRepet[count] = array[i];
						count++;
					}
				}	
		System.out.println("����� ������������� �����: " + Arrays.toString(numWithMaxOfRepet));
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < numWithMaxOfRepet.length; i++) {
			if(numWithMaxOfRepet[i] < min) {
				min = numWithMaxOfRepet[i];
			}
		}
		System.out.println();
		System.out.println("����������� ����� �� ���� ������������� �����: " + min);	
	}

}
