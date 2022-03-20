package basics_1.linear_programs;

//5.Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.
public class Task5 {

	public static void main(String[] args) {
		int t = 3659067;
		int hours = (int) (t / 3600);
		t = t - (hours * 3600);
		
		int minutes = (int) (t / 60);
		int seconds = t % 60;
		
		 System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
	}

}
