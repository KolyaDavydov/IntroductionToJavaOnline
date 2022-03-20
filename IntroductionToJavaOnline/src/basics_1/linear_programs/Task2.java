package basics_1.linear_programs;

/*
2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
*/

public class Task2 {

	public static void main(String[] args) {
		double a = 5.0;
		double b = 4.0;
		double c = 2.0;
		double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("Значение выражения = " + result);

	}

}
