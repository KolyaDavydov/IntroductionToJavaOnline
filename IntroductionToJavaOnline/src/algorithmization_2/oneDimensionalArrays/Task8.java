package algorithmization_2.oneDimensionalArrays;

/*
8. Дана последовательность целых чисел a1,a2,,an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1,a2,,an) .
*/

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		int[] oldArray = new int[20];
		for(int i = 0; i < oldArray.length; i++) {
			oldArray[i] = (int) (Math.random() * 10 - 7);
		}
		
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < oldArray.length; i++) {
			if(oldArray[i] < min) {
				min = oldArray[i];
			}
		}
		System.out.println("Ìèíèìàëüíîå ÷èñëî èç ïîñëåäîâàòåëüíîñòè: " + min);
		
		int counterMin = 0;		
		for(int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] == min) {
				counterMin++;
			}
		}
		System.out.println("Êîëè÷åñòâî ïîâòîðåíèé ìèíèìàëüíîãî ÷èñëà: " + counterMin);
		
		int[] newArray = new int[oldArray.length - counterMin];
		
		int counterNewArrayIndex = 0;
		for(int i = 0; i < oldArray.length; i++) {
			if(oldArray[i] != min) {
				newArray[i - counterNewArrayIndex] = oldArray[i];
			}
			else {
				counterNewArrayIndex++;
			}
		}
		
		System.out.println("Ñòàðàÿ ïîñëåäîâàòåëüíîñòü: " + Arrays.toString(oldArray)+ " äëèíà: " + oldArray.length);
        System.out.println("Íîâàÿ ïîñëåäîâàòåëüíîñòü: " + Arrays.toString(newArray) + " äëèíà " + newArray.length);
	}

}
